package behavioral.templatemethod;

public class App {

    public static void main(String[] args) {

        var welcomeEmail = new WelcomeEmail();
        welcomeEmail.sendGreeting();
        welcomeEmail.sendMessageBody();
        welcomeEmail.sendClosing();

        var unSubscribeEmail = new UnSubscribeEmail();
        unSubscribeEmail.sendGreeting();
        unSubscribeEmail.sendMessageBody();
        unSubscribeEmail.sendClosing();
    }
}
