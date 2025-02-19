package behavioral.visitor;

public class File implements FileSystemElement{

    private final String name;
    private final int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getSize() {
        return size;
    }
}
