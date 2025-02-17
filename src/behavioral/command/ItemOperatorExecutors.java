package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class ItemOperatorExecutors {

    List<ItemOperation> itemOperations = new ArrayList<>();

    public void queueOperation(ItemOperation operation){
        itemOperations.add(operation);
    }
    public void checkOut(){
        itemOperations.forEach(ItemOperation::execute);
        itemOperations.clear();
    }
}
