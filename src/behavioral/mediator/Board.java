package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Ticket> inProgressTickets = new ArrayList<>();
    private List<Ticket> doneTickets = new ArrayList<>();

    public List<Ticket> getDoneTickets(){
        return this.doneTickets;
    }

    public void addTicketToInProgressTickets(Ticket ticket){
        inProgressTickets.add(ticket);
      //  ticket.setStatus(Ticket.Status.IN_PROGRESS);
        System.out.println("Tickets added to InProgress tickets");
    }

    public void addTicketToDoneTickets(Ticket ticket){
       // ticket.setStatus(Ticket.Status.DONE);
        doneTickets.add(ticket);
        System.out.println("Tickets added to done tickets");
        inProgressTickets.remove(ticket);
        System.out.println("Tickets removed from In progress tickets ");
    }
}
