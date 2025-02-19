package behavioral.strategy;

public interface Authenticator {

    void logIn();

    Authenticator passwordAuthenticator = () -> System.out.println("Logging with username and password");
    Authenticator singleSignOnAuthenticator = () -> System.out.println("Signing in with single sign-on");
}
