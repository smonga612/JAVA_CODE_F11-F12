import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class student_bean {

    private String name;

    // Support object for firing events
    private PropertyChangeSupport pcs =
            new PropertyChangeSupport(this);

    // Getter
    public String getName() {
        return name;
    }
// Setter (fires event)
    public void setName(String newName) {

        String oldName = this.name;
        this.name = newName;

        // Notify all listeners
        pcs.firePropertyChange("name", oldName, newName);
    }

    // Register listener
    public void addPropertyChangeListener(
            PropertyChangeListener listener) {
        pcs.addPropertyChangeListener(listener);
    }

    // Remove listener
    public void removePropertyChangeListener(
            PropertyChangeListener listener) {
        pcs.removePropertyChangeListener(listener);
    }
}
