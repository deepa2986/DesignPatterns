package structural.flyweight;

public class Flower {

    private String name;

    public Flower(String name){
        this.name = name;
        System.out.println("creating" + name + "object");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println("done creating" + name + "object");
    }
}
