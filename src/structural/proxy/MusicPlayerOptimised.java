package structural.proxy;

public class MusicPlayerOptimised {

    private static final RecommendationsProxy recommendationsProxy = new RecommendationsProxy();
    public static void main(String[] args) {
        var user = new User("jack",false);
        loadHomePage(user);
        loadingDiscoverPage(user);
    }

    private static void loadHomePage(User user){
        System.out.println("loading home page..." );
        recommendationsProxy.showRecommendations(user);
    }

    private static void loadingDiscoverPage(User user){
        System.out.println("loading discover page");
        recommendationsProxy.showRecommendations(user);
    }
}
