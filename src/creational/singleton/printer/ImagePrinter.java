package creational.singleton.printer;

public class ImagePrinter {

    public void printImage(){
      //  var spooler = new PrintSpooler();
        var spooler = PrintSpooler.getInstance();
        spooler.print();
    }
}
