package structural.bridge;

public class Square implements Shape{

    private final Color color;

    public Square(Color color){
        this.color = color;
    }
    @Override
    public void getType() {
        System.out.println("square");
    }

    @Override
    public Color getColor() {
        return color;
    }
}
