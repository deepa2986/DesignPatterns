package behavioral.command;

public class AddItemToBasketOperation implements ItemOperation{

    private final Item item;
    public AddItemToBasketOperation(Item item){
        this.item = item;
    }

    @Override
    public void execute(){
        item.addToBasket();
    }
}
