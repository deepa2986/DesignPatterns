package structural.adapter;

public class Greeting {

    private final LocalizedMessage message;

    public Greeting(LocalizedMessage message) {
        this.message = message;
    }

    public void print(){
        message.sayHello();
    }
}
