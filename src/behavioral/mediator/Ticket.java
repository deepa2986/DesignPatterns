package behavioral.mediator;

public class Ticket {

    private Assignee assignee;
    public enum Status{
        SUBMITTED,
        IN_PROGRESS,
        DONE
    }
    public Status status;

    public Status getStatus(){
        return this.status;
    }

    public void setStatus(Status status){
        this.status = status;
        System.out.println("Ticket status changed to : " +status);
    }

    public void setAssignee(Assignee assignee){
        this.assignee = assignee;
    }
}
