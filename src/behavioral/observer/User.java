package behavioral.observer;

import java.beans.PropertyChangeSupport;

public class User {
    private String status;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);
    public void setStatus(String status){
        support.firePropertyChange("status",this.status,status);
        this.status = status;
    }
    public void addPropertyChangeListener(NewsFeed newsFeed){
        support.addPropertyChangeListener(newsFeed);
    }
}
