package creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryMaker {

    private static  final Map<String, Supplier<UserInterfaceFactory>> factories = new HashMap<>();

    static {
        factories.put("BLUE",BlueUserInterfaceFactory::new);
        factories.put("RED",RedUserInterfaceFactory::new);
    }

    public static UserInterfaceFactory createFactory(String color){
        if(factories.get(color) != null){
            return factories.get(color).get();
        }else throw new IllegalArgumentException("Color mismatched");
    }
}
