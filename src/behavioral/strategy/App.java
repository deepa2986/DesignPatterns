package behavioral.strategy;

public class App {

    public static void main(String[] args) {

        var logInPage = new LoginPage();
//        logInPage.logInUser(new passwordAuthenticator());
//        logInPage.logInUser(new SingleSignOnAuthenticator());

//        logInPage.logInUser(() -> System.out.println("Logging with username and password"));
//        logInPage.logInUser(() -> System.out.println("Logging with single sign-on"));

        logInPage.logInUser(Authenticator.passwordAuthenticator);
        logInPage.logInUser(Authenticator.singleSignOnAuthenticator);
    }
}
