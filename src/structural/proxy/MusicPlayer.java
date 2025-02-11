package structural.proxy;

public class MusicPlayer {

    public static void main(String[] args) {
        var user = new User("jack",true);
        var recommendations = new SongRecommendations(user);
        loadHomePage(user,recommendations);
        loadingDiscoverPage(user,recommendations);
    }
    private static void loadHomePage(User user,SongRecommendations recommendations){
        System.out.println("Loading home page..");
      //  var songRecommendations = new SongRecommendations(user);
        recommendations.showRecommendations(user);
    }
    private static void loadingDiscoverPage(User user,SongRecommendations recommendations){
        System.out.println("Loading discover page..");
       // var recommendations = new SongRecommendations(user);
        recommendations.showRecommendations(user);
    }
}
