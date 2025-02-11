package structural.decorator;

public class House {

    public static void main(String[] args) {

        var room = new BasicRoom();
        room.printFurniture();
        System.out.println();

        var roomWithCouch = new RoomWithCouch(room);
        roomWithCouch.printFurniture();
        System.out.println();

        var roomWithCouchAndTable = new RoomWithTable(roomWithCouch);
        roomWithCouchAndTable.printFurniture();

    }
}
