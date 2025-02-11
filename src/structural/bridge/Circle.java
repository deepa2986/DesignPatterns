package structural.bridge;

public class Circle implements Shape{

    private final Color color;

    public Circle(Color color) {
        this.color = color;
    }

    @Override
    public void getType() {
        System.out.println("circle");
    }

    @Override
    public Color getColor() {
        return color;
    }
}
