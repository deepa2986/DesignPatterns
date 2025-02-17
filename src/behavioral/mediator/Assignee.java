package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Assignee {

    List<Ticket> tickets  = new ArrayList<>();

    public void pickUpTicket(Ticket ticket){
       // public void pickUpTicket(Ticket ticket, Board board){
        System.out.println("Tickets picked up by assignee");
        tickets.add(ticket);
//        ticket.setAssignee(this);
//        board.addTicketToInProgressTickets(ticket);
    }

    public void resolveTicket(Ticket ticket){
      //  public void resolveTicket(Ticket ticket, Board board){
        tickets.remove(ticket);
      //  board.addTicketToDoneTickets(ticket);
        System.out.println("Tickets removed");
    }
}
