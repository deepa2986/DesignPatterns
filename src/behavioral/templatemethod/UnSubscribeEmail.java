package behavioral.templatemethod;

public class UnSubscribeEmail extends Email{

//    public void sendGreeting(){
//        System.out.println("Hello");
//    }

    @Override
    public void sendMessageBody(){
        System.out.println("we are sorry to see you go.");
    }

//    public void sendClosing(){
//        System.out.println("Best regards, april");
//    }
}
