package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {

    private static final  Map<String,Flower> map = new HashMap<>();

    public static Flower createFlower(String name){
        return map.computeIfAbsent(name,Flower::new);
    }

}
