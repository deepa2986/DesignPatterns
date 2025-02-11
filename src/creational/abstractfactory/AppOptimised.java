package creational.abstractfactory;

public class AppOptimised {

    public static void main(String[] args) {
        UserInterface red = createUserInterface("RED");
        UserInterface blue = createUserInterface("BLUE");
        System.out.println(red);
        System.out.println(blue);
    }

    private static UserInterface createUserInterface(String color){
        UserInterfaceFactory factory = FactoryMaker.createFactory(color);
        Button button = factory.createButton();
        ScrollBar scrollbar = factory.createScrollbar();
        return new UserInterface(button,scrollbar);
    }
}
