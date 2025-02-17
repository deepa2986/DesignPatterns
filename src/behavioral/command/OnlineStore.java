package behavioral.command;

public class OnlineStore {

    public static void main(String[] args) {

        var item1 = new Item(1);
        var item2 = new Item(2);
        var item3 = new Item(3);

//        item1.addToBasket();
//        item2.addToBasket();
//        item3.addToBasket();
//        item2.removeFromBasket();

//        ItemOperatorExecutor executor = new ItemOperatorExecutor();
//        executor.doOperation(new AddItemToBasketOperation(item1));
//        executor.doOperation(new AddItemToBasketOperation(item2));
//        executor.doOperation(new AddItemToBasketOperation(item3));
//        executor.doOperation(new RemoveItemFromBasketOperation(item1));

        ItemOperatorExecutors executor = new ItemOperatorExecutors();
        executor.queueOperation(new AddItemToBasketOperation(item1));
        executor.queueOperation(new AddItemToBasketOperation(item2));
        executor.queueOperation(new AddItemToBasketOperation(item3));
        executor.queueOperation(new RemoveItemFromBasketOperation(item3));

        executor.checkOut();

    }
}
