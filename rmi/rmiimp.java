import java.rmi.*;
import java.rmi.server.*;

interface Hello extends Remote {
    String sayHello() throws RemoteException;
}

 class HelloImpl extends UnicastRemoteObject implements Hello {
    int counter=0;
    protected HelloImpl() throws RemoteException {
        super();
    }

    public String sayHello() {
        return "Hello from Server the value of counter is "+(++counter);
    }
}