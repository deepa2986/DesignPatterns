package creational.singleton.log;

public enum Logger {

    LOG;

    public static Logger getLog(){
        return LOG;
    }
    void log(String logMessage){
        System.out.println(logMessage);
    }
}
