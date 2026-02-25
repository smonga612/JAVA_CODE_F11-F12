import java.beans.*;

public class StudentBeans {

    private int age;

    private VetoableChangeSupport vcs =
            new VetoableChangeSupport(this);

    // Getter
    public int getAge() {
        return age;
    }
// Setter with validation permission
    public void setAge(int newAge)
            throws PropertyVetoException {

        int oldAge = age;

        // Ask listeners for permission
        vcs.fireVetoableChange("age", oldAge, newAge);

        // Change applied only if not vetoed
        age = newAge;
        System.out.println("Age updated to: " + age);
    }

    // Register listener
    public void addVetoableChangeListener(
            VetoableChangeListener listener) {
        vcs.addVetoableChangeListener(listener);
    }

    // Remove listener
    public void removeVetoableChangeListener(
            VetoableChangeListener listener) {
        vcs.removeVetoableChangeListener(listener);
    }
}
