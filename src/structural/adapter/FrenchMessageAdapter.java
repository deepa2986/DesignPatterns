package structural.adapter;

public class FrenchMessageAdapter implements LocalizedMessage {

    private final FrenchLocalizedMessage message;

    public FrenchMessageAdapter(){
        message = new FrenchLocalizedMessage();
    }

    @Override
    public void sayHello() {
        message.sayBonjour();
    }
}
