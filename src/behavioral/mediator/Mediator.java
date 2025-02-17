package behavioral.mediator;

public class Mediator {

    private Ticket ticket;
    private Assignee assignee;
    private Board board;

    public Mediator(Ticket ticket, Assignee assignee, Board board) {
        this.ticket = ticket;
        this.assignee = assignee;
        this.board = board;
    }

    public void pickUpTicket(){
        assignee.pickUpTicket(ticket);//decoupling
       // assignee.pickUpTicket(ticket,board);
        ticket.setAssignee(assignee);
        ticket.setStatus(Ticket.Status.IN_PROGRESS);
        board.addTicketToInProgressTickets(ticket);
    }

    public void resolveTicket(){
        assignee.resolveTicket(ticket);//decoupling
       // assignee.resolveTicket(ticket,board);
        ticket.setStatus(Ticket.Status.DONE);
        board.addTicketToDoneTickets(ticket);
    }
}
