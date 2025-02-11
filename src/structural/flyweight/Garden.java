package structural.flyweight;

public class Garden {

    public static void main(String[] args) {

//        var sunFlower1 = new Flower("SunFlower");
//        var sunFlower2 = new Flower("SunFlower");
//        var sunFlower3 = new Flower("SunFlower");

         var sunFlower1 = FlowerFactory.createFlower("Sunflower");
        var sunFlower2 = FlowerFactory.createFlower("Sunflower");
        var sunFlower3 = FlowerFactory.createFlower("Sunflower");

        System.out.println(sunFlower1);
        System.out.println(sunFlower2);
        System.out.println(sunFlower3);

//        var rose1 = new Flower("Rose");
//        var rose2 = new Flower("Rose");
//        var rose3 = new Flower("Rose");

        var rose1 = FlowerFactory.createFlower("Rose");
        var rose2 = FlowerFactory.createFlower("Rose");
        var rose3 = FlowerFactory.createFlower("Rose");
        System.out.println(rose1);
        System.out.println(rose2);
        System.out.println(rose3);





    }
}
