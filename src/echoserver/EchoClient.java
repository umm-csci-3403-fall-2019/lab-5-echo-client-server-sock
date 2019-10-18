package echoserver;
import java.net.*;
import java.io.*;

public class EchoClient {
    public static final int portNumber = 6013;

    public static void main(String[] args) throws IOException {
        String server;
        if (args.length == 0) {
            server = "127.0.0.1";
          } else {
            server = args[0];
          }

          try {
              //connecting to the server
            Socket socket = new Socket(server, portNumber);
            InputStream input = socket.getInputStream();
            InputStream output = socket.getOutputStream(); 
            
            
            // Print all the input we receive from the server
            int line;
            int outputByte;

            while ((line = reader.readLine()) != -1) {
              output.write(keyboardByte);
              output.flush();
              outputByte = input.read();
              System.out.println(line);
            }


            System.out.flush();
      
            // Close the socket when we're done reading from it
            socket.close();
          }catch (ConnectException ce) {
            System.out.println("We were unable to connect to " + server);
            System.out.println("You should make sure the server is running.");
          } catch (IOException ioe) {
            System.out.println("We caught an unexpected exception");
            System.err.println(ioe);
          }
        }
      }