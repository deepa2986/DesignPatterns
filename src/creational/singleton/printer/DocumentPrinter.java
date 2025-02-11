package creational.singleton.printer;

public class DocumentPrinter {
    public void printDocument(){
       // var spooler = new PrintSpooler();
        var spooler = PrintSpooler.getInstance();
        spooler.print();
    }
}
