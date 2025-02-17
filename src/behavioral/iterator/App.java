package behavioral.iterator;

public class App {

    public static void main(String[] args) {
        var pen = new Item("pen",10);
        var book = new Item("book",16);
        var eraser = new Item("eraser",20);
        var pencil = new Item("pencil",0);

        var inventory = new Inventory(pen,book,eraser,pencil);
        var stockIterator = inventory.iterator();
        while (stockIterator.hasNext()){
            var item = stockIterator.next();
            System.out.println(item.getName());
        }

    }
}
