//Client Code 
import java.rmi.*;

class Client {
    public static void main(String[] args) {
        try {
            Hello obj = (Hello) Naming.lookup("rmi://172.25.228.133/HelloService");
            System.out.println(obj.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}