//Server Code
import java.rmi.*;
import java.rmi.registry.*;

class Server {
    public static void main(String[] args) {
        try {
            HelloImpl obj = new HelloImpl();
            Naming.rebind("rmi://172.25.228.133/HelloService", obj);
            System.out.println("Server is ready...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}