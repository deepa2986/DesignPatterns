package creational.singleton.log;

public class Dog {

    private final Logger logger = Logger.getLog();

    public void woof(){
        logger.log("woof");
    }
}
