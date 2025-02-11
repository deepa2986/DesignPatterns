package creational.factorymethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TicketMachine {

//    Ticket createTicket(String ticketType){
//        if(ticketType.equalsIgnoreCase("bus")){
//            return new BusTicket();
//        }else return new TrainTicket();
//    }

    private static final Map<String, Supplier<Ticket>> map = new HashMap<>();
    static {
        map.put("Bus" , BusTicket::new);
        map.put("Train", TrainTicket::new);
    }

    Ticket createTicket(String ticketType){
        if(map.get(ticketType) != null){
            return map.get(ticketType).get();
        }else throw new IllegalArgumentException("Invalid ticket type");
    }
}
