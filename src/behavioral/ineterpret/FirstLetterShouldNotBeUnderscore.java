package behavioral.ineterpret;

public class FirstLetterShouldNotBeUnderscore implements Expressions {
    FirstLetterShouldNotBeLowerCase notBeLowerCase =  new FirstLetterShouldNotBeLowerCase();
    @Override
    public String interpret(String context) {
        if(context.startsWith("_")){
            context = context.substring(1);
        }
        return notBeLowerCase.interpret(context);
    }
}
