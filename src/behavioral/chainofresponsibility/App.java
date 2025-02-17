package behavioral.chainofresponsibility;

public class App {

    public static void main(String[] args) {
        var message = "Hello world";
        var request = new LoggerRequest(message, LoggerRequest.LoggerType.CONSOLE);
      //  Logger logger = new FileLogger();
        Logger logger = buildChain();
        logger.log(request);
    }

    private static Logger buildChain(){
        var fileLogger = new FileLogger(null);
        var consoleLogger = new ConsoleLogger(fileLogger);
        return consoleLogger;
    }

}
