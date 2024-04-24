package com.cbfacademy;


/* Create a simple program with two classes:

a ExerciseServer class which uses a ServerSocket to listen for connections on localhost:4040, then prints message it receives on the screen.
a ExerciseClient class which requests a connection to server, sends a simple text message to the server.
Ensure to release all resources at the end of your program.*/
import java.net.URL;

public class ExerciseServer {
public static void main(String[] args)  {

    try (ServerSocket serverSocket = new ServerSocket(4040)) {

        System.out.println("Server started. Listening on port 4040...");
}
}
}
    
