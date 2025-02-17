package behavioral.mediator;

public class App {

    public static void main(String[] args) {
        var ticket = new Ticket();
        var board = new Board();
        var assignee = new Assignee();
        var mediator = new Mediator(ticket,assignee,board);

//        assignee.pickUpTicket(ticket,board);
//        System.out.println();
//        assignee.resolveTicket(ticket,board);

        mediator.pickUpTicket();
        System.out.println();
        mediator.resolveTicket();


    }
}
