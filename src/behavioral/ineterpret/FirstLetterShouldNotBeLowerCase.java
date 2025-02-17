package behavioral.ineterpret;

public class FirstLetterShouldNotBeLowerCase implements Expressions{
    private NoWhiteSpace whiteSpace = new NoWhiteSpace();
    @Override
    public String interpret(String context) {
        context = context.substring(0,1).toLowerCase() + context.substring(1);
        return whiteSpace.interpret(context);
    }
}
