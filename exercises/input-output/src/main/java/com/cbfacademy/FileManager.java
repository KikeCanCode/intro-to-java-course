package com.cbfacademy;

/*Part 1
Create a class called FileManager with the following methods:
public List<String> readFile(String filename) - returns a List<String> object, 
where each list item is a line from the specified file

public void copy(String inputFile, String outputFile) 
- copies the contents of a text file at the path defined by 
inputFile to the path defined by outputFile. 
Creates outputFile if it doesn't exist and overwrites it, if it does */
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;


public class FileManager {

   // public static void main (String[] args) {
        //readFile() method - indicating that the method is used for reading files.
    public static List<String> readFile(String filename){  // A method that return a String Reads the content of a file specified by the filename and returns it as a list of strings, where each string represents a line from the file.
    List<String> lines = new ArrayList<>();

    // Creates a new List<String> object, where each list item is a line from the specified file
        //This line opens a file specified by filename for reading using a FileReader, and then wraps it in a BufferedReader
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
        String line; // Declares a variable line of type String to store each line read from the file.
    while ((line = br.readLine()) != null) {
        lines.add(line); //lines.add(line) - Method adds each line read from the file to the List<String> called lines.
    } 
    }catch (IOException e){
        System.out.println(lines);
    }
    return lines;
    }
 
    public void copy (String inputFile, String outputFile){

    try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        
       BufferedReader writer = new BufferedReader(new OutputStreamWriter(outputFile))) {
        String line;
    while ((line = reader.readLine()) != null) {
        writer.write(line);
        writer.readLine();
    }
    }
    catch (IOException e) {
         e.printStackTrace();
    }
}           
    public static void main (String[] args) {
        FileManager FileManager = new FileManager();
        List<String> lines = FileManager.readFile("input.txt");
        for (String line : lines) {
            System.out.println(lines);
        }
        FileManager.copy("input.txt", "output.txt");
    
    }
}

//https://www.w3schools.com/java/java_files.asp