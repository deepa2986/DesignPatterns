package behavioral.visitor;

public class App {

    public static void main(String[] args) {

        var directory1 = new Directory("Directory1");
        var file1 = new File("File1", 100);
        directory1.addElement(file1);

        var directory2 = new Directory("Directory2");
        var file2 = new File("File2", 200);
        directory2.addElement(file2);

        directory1.addElement(directory2);

        var visitor = new CalculateSizeVisitor();
        directory1.accept(visitor);

        System.out.println("Total size : "+visitor.getTotalSize());
    }
}
