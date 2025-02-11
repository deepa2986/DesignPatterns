package structural.decorator;

public class RoomWithCouch extends RoomDecorator{


    protected RoomWithCouch(Room room) {
        super(room);
    }

    public void printFurniture(){
        super.printFurniture();
        System.out.println("Couch");
    }
}
