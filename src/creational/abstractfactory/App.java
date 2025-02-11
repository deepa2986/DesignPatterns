package creational.abstractfactory;

public class App {

    public static void main(String[] args) {
        UserInterface redUI = createUserInterface("RED");
        UserInterface blueUI = createUserInterface("BLUE");

        System.out.println(redUI);
        System.out.println(blueUI);

    }

    public static UserInterface createUserInterface(String color){
        if(color.equalsIgnoreCase("RED")){
            return new UserInterface(new RedButton(),new RedScrollbar());
        }else if(color.equalsIgnoreCase("BLUE")){
            return new UserInterface(new BlueButton(),new BlueScrollbar());
        }else throw  new IllegalArgumentException("color mismatched");
    }
}
