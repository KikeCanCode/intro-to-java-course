package com.cbfacademy;

    import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
    import java.io.PrintWriter;
    import java.net.Socket;

    public class ExerciseClient {
        public static void main(String[] args) {
            try {
                Socket ClientSocket = new Socket("localhost", 4040); // The client creates a Socket object named ClientSocket and connects it to the server running on localhost at port 4040 using new Socket("localhost", 4040)
                /* PrintWriter is used for writing formatted text to a character-output stream.
                BufferedReader is used for reading text from a character-input stream.*/
                //PrintWriter writer = new PrintWriter(new OutputStreamWriter(ClientSocket.getOutputStream()),true);
                OutputStream outputStream = ClientSocket.getOutputStream();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
                PrintWriter writer = new PrintWriter(outputStreamWriter, true);
                writer.println("Hello Server!");
                writer.close();
                ClientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
//https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/socketprogramming/socketprogram.html
//https://www.javatpoint.com/socket-programming
// PrintWriter writer = new PrintWriter(new OutputStreamWriter(ClientSocket.getOutputStream()),true);
//javac com/cbfacademy/ExerciseClient.java
//java com.cbfacademy.ExerciseClient