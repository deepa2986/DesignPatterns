package structural.decorator;

public class RoomWithTable extends RoomDecorator{

    public RoomWithTable(Room room){
        super(room);
    }

    public void printFurniture(){
        super.printFurniture();
        System.out.println("Table");
    }
}
