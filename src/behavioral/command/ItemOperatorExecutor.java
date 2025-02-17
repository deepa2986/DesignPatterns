package behavioral.command;

public class ItemOperatorExecutor {

    public void doOperation(ItemOperation operation){
        operation.execute();
    }
}
