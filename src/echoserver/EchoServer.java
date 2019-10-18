package echoserver;
import java.net.*;
import java.io.*;

public class EchoServer {
    public static final int portNumber = 6013;

   public static void main(String[] args) {
     try{
     //  listening on the specified port
    ServerSocket sock = new ServerSocket(portNumber);

   while (true) {
    Socket client = sock.accept();
    System.out.println("Got a request!");
   PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
    // open up IO streams
     In  in  = new In (client);
     Out out = new Out(client);
    // waits for data and reads it in until connection dies
            // readLine() blocks until the server receives a new line from client
     String s;
     while ((s = in.readLine()) != null) {
         out.println(s);
     }
     System.err.println("Closing connection with client");
            out.close();
            in.close();

    client.close();
} 
}catch (IOException ioe) {
  System.out.println("We caught an unexpected exception");
  System.err.println(ioe);
}
}
}