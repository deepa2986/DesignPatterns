package behavioral.command;

public class Item {

    private final int id;

    public Item(int id) {
        this.id = id;
    }

    public void addToBasket(){
        System.out.println("Item " + id + " added");
    }

    public void removeFromBasket(){
        System.out.println("Item " +id+ " removed");
    }
}
