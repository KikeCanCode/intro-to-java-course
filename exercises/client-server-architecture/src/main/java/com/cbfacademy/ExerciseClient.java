package com.cbfacademy;

    import java.io.IOException;
    import java.io.OutputStreamWriter;
    import java.io.PrintWriter;
    import java.net.Socket;

    public class ExerciseClient {
        public static void main(String[] args) {
            try {
                Socket mySocket = new Socket("localhost", 4040);
                PrintWriter writer = new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()), true);
                writer.println("Hello Server!");
                writer.println("This is a random second greeting to you oh server!");
                writer.close();
                mySocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }
//https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/socketprogramming/socketprogram.html