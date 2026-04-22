import java.io.*;
import java.net.*;

 class ServerExample {
    public static void main(String[] args) {

        try {
            // Create ServerSocket on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);
System.out.println("Server is waiting for client...");
Socket socket;
while(true)
{            


            // Accept client connection
             socket= serverSocket.accept();
            System.out.println("Client connected!");
 // Input and Output streams
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Read message from client
            String message = input.readLine();
            System.out.println("Client says: " + message);

            // Send response to client
            output.println("Hello from Server");
socket.close();
//serverSocket.close();
}
            // Close connections
            
            

        } catch (IOException e) {
            e.printStackTrace();
        

}    
}
}
