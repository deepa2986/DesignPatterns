package behavioral.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class NewsFeed implements PropertyChangeListener {

    private List<String> statuses = new ArrayList<>();

    public void printStatus(){
        statuses.forEach(System.out::println);
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        statuses.add((String) event.getNewValue());
    }
}
