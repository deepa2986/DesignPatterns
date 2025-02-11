package structural.bridge;

public class App {

    public static void main(String[] args) {
         var circle = new Circle(new BlueColor());
         circle.getType();
         circle.getColor().get();

         var square = new Square(new RedColor());
         square.getType();
         square.getColor().get();
    }
}
