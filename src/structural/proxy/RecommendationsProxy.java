package structural.proxy;

public class RecommendationsProxy implements Recommendations{

    private Recommendations recommendations;

    @Override
    public void showRecommendations(User user) {
        if (user.isPremium()) {
            if (recommendations == null) {
                recommendations = new SongRecommendations(user);
            }
            recommendations.showRecommendations(user);
        } else {
            System.out.println("upgrade to premium to see song recommendations");
        }
    }
}
