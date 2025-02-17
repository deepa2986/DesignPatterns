package behavioral.observer;

public class App {

    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();
        var newsFeed = new NewsFeed();

        user1.addPropertyChangeListener(newsFeed);
        user2.addPropertyChangeListener(newsFeed);

        user1.setStatus("Enjoying weather!");
        user2.setStatus("Morning Glory!");
        newsFeed.printStatus();
    }
}
