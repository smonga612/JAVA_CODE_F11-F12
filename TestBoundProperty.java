public class TestBoundProperty {

    public static void main(String[] args) {

        student_bean student = new student_bean();

        studentlistener listener =
                new studentlistener();

        // Register listener
        student.addPropertyChangeListener(listener);

        // Change property value
        student.setName("Rahul");
        student.setName("Amit");
    }
}    