package behavioral.ineterpret;

public class App {

    public static void main(String[] args) {
        var context = "_My Variable";
        var notBeLowerCase = new FirstLetterShouldNotBeUnderscore();
        String interpret = notBeLowerCase.interpret(context);
        System.out.println(interpret);
    }
}
