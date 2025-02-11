package creational.factorymethod;

public class TicketOffice {

    private static final TicketMachine ticketMachine = new TicketMachine();

    public static void main(String[] args) {
        busTicket();
        trainTicket();
    }

    private static void busTicket(){
        var ticket = ticketMachine.createTicket("Bus");
        System.out.println("one bus ticket is created : " +ticket.getPrice());
    }

    private static void trainTicket(){
        var ticket = ticketMachine.createTicket("Train");
        System.out.println("one train ticket is booked : " +ticket.getPrice());
    }
}
