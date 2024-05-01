package com.cbfacademy;

import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebsiteReader { // Class
    public String message;
/* Create a program that connects to the CBF academy website, then prints its content to the screen line by line.
Whenever possible, use the try-with-resources construct we saw earlier in the course, and ensure to release all resources.*/

    public static void main (String[] args) throws Exception { // Throw exception method
        try { 
            URL myURL = new URL("https://codingblackfemales.com/"); // Defines the URL of the CBF academy website.
            URLConnection myURLConnection = myURL.openConnection();      //Creates a URL object with the specified URL.
            myURLConnection.connect();
            /* You can wrap your InputStream in a InputStreamReader and can use it's read() method to read character 
            data directly (note that you should specify the encoding when creating the Reader.*/

           //String InputStreamReader = myURLConnection.getInputStream(); 
            /* getInputStream(): The getInputStream() method of URLConnection returns an InputStream that allows the 
            application to read from the URL resource. This method opens a connection to the URL if
             it is not already open, retrieves the content, and returns an InputStream to read the content from.*/ 
            
            BufferedReader in = new BufferedReader(new InputStreamReader(myURL.openStream())); // BufferReader reads web content/ read content of a stream - Allows to process the lines and characters 
            String inputLine; //inputLine is just a variable used to store each line of text as it's read from the input stream within a loop. It's a common convention to use such a variable name when reading lines of input.
                while ((inputLine = in.readLine()) != null) {
                System.out.println(inputLine);
                }
                in.close(); 

        /*The close() method of Reader Class in Java is used to close the stream and release the resources that were busy 
            in the stream, if any. This method has following results: If the stream is open, it closes the stream releasing the resources. 
            If the stream is already closed, it will have no effect.*/
        /*try (BufferedReader reader = new BufferedReader(new InputStreamReader(myURL.openStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);*/
                } 
                catch (MalformedURLException e) { // if the new URL failed. 
                    System.out.println(e.getMessage()); 

            } 
            catch (IOException e) { // if opened connection failed.
                System.out.println(e.getMessage());
            
            }
    }
}

// e.printStackTrace()

//https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html