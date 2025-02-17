package behavioral.ineterpret;

public class NoWhiteSpace implements Expressions{
    @Override
    public String interpret(String context) {
        return context.replaceAll(" ","");
    }
}
