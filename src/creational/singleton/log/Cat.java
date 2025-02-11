package creational.singleton.log;

public class Cat {

    private static final Logger logger = Logger.getLog();

    public void meow(){
        logger.log("meow");
    }
}
