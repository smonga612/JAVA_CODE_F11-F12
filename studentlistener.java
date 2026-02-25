import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class studentlistener
        implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {

        System.out.println("Property Changed");
        System.out.println("Property Name : "
                + evt.getPropertyName());
        System.out.println("Old Value : "
                + evt.getOldValue());
        System.out.println("New Value : "
                + evt.getNewValue());
    }
}
    