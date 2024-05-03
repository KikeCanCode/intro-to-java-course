/* Create a simple program with two classes
a ExerciseServer class which uses a ServerSocket to listen for connections on localhost:4040, then prints message it receives on the screen.
a ExerciseClient class which requests a connection to server, sends a simple text message to the server.
Ensure to release all resources at the end of your program.*/

package com.cbfacademy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class ExerciseServer {
    public static void main(String[] args) {
        // what class ?
 
        try (ServerSocket server = new ServerSocket(4040)) { // no connection yet
             System.out.println("Server connected successfully. Start listening on port 4040");
            try (Socket client = server.accept()) { // client 
                System.out.println("Hello");
                InputStreamReader inputStreamReader = new InputStreamReader(client.getInputStream());
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String line;
                while ((line = bufferedReader.readLine()) != null){
                    System.out.println(line);
                }
            }  
        } 
        catch (IOException serverException) {// e represent a variable of IO exception
            System.out.println("Problem hearing from client: " + serverException.getMessage());
 
 
        } //        catch (IOException clientException) {}
    }
}
 
    
   /*  
   Option 2
   public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(4040)) { // create a ServerSocket object and bind it to port 4040 using new ServerSocket(4040). This socket will listen for incoming connections.

            System.out.println("Server started. Listening on port 4040..."); // Prints out the message
        }   
            ServerSocket serverSocket; // local variable 
        try (Socket ClientSocket = serverSocket.accept();   // accept() method

            BufferedReader in = new BufferedReader(new InputStreamReader(ClientSocket.getInputStream()))){
            String listen;
        

        while ((listen = in.readLine()) != null) {//while (true){ //We enter a loop where the server continuously accepts incoming connections using the accept() method of ServerSocket.
                System.out.println("Received from client: " + listen);
        }
            }

        catch (Exception e) {
            System.out.println("Problem hearing from client: " + e.getMessage());
        }
    }
}*/
