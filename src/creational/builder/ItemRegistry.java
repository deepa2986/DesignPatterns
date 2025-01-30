package creational.builder;

public class ItemRegistry {

    public static void main(String[] args) {

        var item1 = new StoreItem.StoreItemBuilder("pasta",30.0)
                .longDescription("a tasty dish one must try!")
                .stockAvailable(10)
                .build();

        var item2 = new StoreItem.StoreItemBuilder("roti/dal",50.0)
                .shortDescription("delicious and healthy food")
                .packagingType("box")
                .build();

        addToItemRegistry(item1);
        addToItemRegistry(item2);


    }

    public static void addToItemRegistry(StoreItem item){
        System.out.println("added : " +item);
    }
}
