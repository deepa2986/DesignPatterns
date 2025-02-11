package structural.adapter;

public class App {

    public static void main(String[] args) {
        EnglishLocalizedMessage message = new EnglishLocalizedMessage();
        Greeting englishGreeting = new Greeting(message);
        englishGreeting.print();

       var message1 = new FrenchMessageAdapter();
        Greeting frenchGreeting = new Greeting(message1);
        frenchGreeting.print();
    }
}
