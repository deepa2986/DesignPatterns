package behavioral.memento;

public class DocumentOverview {
    public static void main(String[] args) {
        var textDocument = new TextDocument();
        textDocument.write("Hello World");
        textDocument.save();
        textDocument.print();
        textDocument.write("how are you");
        textDocument.print();
        textDocument.undo();
        textDocument.print();
    }
}
