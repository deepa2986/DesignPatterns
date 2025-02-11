package creational.singleton.printer;

//public final class PrintSpooler {
   // public class PrintSpooler {
public enum PrintSpooler {
    INSTANCE;

    //final class,private constructor,private variable and public method
    //but it's not thread safe
    //then using synchronised method will slow down the application
    //solution use enum , since enum is thread safe and less code :)

    private PrintSpooler(){}
   // private static PrintSpooler INSTANCE;

//    public static PrintSpooler getInstance(){
//        if (INSTANCE == null){
//            INSTANCE = new PrintSpooler();
//        }
//        return INSTANCE;
//    }
    public static PrintSpooler getInstance(){
        return INSTANCE;
    }

    public void print(){

        System.out.println("Printing..");
    }
}
