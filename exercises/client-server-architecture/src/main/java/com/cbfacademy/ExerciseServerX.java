package com.cbfacademy;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.io.InputStreamReader;
import java.net.Socket; // 


public class ExerciseServerX {
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


        } 
       
//        catch (IOException clientException) {}
    }

    

     

}

   