package behavioral.templatemethod;

public class WelcomeEmail extends Email{

//    public void sendGreeting(){
//        System.out.println("Hello");
//    }

    @Override
    public void sendMessageBody(){
        System.out.println("Thank you for signing up for our service.");
    }

//    public void sendClosing(){
//        System.out.println("Best regards, april");
//    }
}
