import java.beans.PropertyVetoException;

public class TestConstrainedProperty {

    public static void main(String[] args) {

        StudentBeans student = new StudentBeans();

        AgeValidator validator =
                new AgeValidator();

        student.addVetoableChangeListener(validator);

        try {
            student.setAge(20);   // Allowed
            student.setAge(15);   // Rejected
        }
        catch(PropertyVetoException e) {
            System.out.println(
                    "Change rejected: "
                    + e.getMessage());
        }
    }
}
