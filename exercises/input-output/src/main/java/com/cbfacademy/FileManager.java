package com.cbfacademy;

/*Part 1
Create a class called FileManager with the following methods:
public List<String> readFile(String filename) - returns a List<String> object, 
where each list item is a line from the specified file

public void copy(String inputFile, String outputFile) 
- copies the contents of a text file at the path defined by 
inputFile to the path defined by outputFile. 
Creates outputFile if it doesn't exist and overwrites it, if it does */
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class FileManager {
    // public static String line;
    public static void main(String[] args) {

        /*
          File file = new File("../resources");
         for(String fileNames : file.list()) System.out.println(fileNames);
         Path p1 = Paths.get("../resources/exercise.txt");
         System.out.println(readFile("../resources/exercise.txt"));
         */

        copy("../resources/exercise.txt", "../resources/exercise2.txt");

    }

    // readFile() method - indicating that the method is used for reading files.
    public static List<String> readFile(String filename) throws IOException { // A method that return a String Reads the content of a file specified by the filename and returns it as a list of strings, where each string represents a line from thefile.
        List<String> lines = new ArrayList<>();
        Path file = Paths.get(filename);

        if (Files.exists(file) != true) {
            throw new IOException("File does not exist");
        } else {
            // (BufferedReader bufferedReader = new BufferedReader(newFileReader(filename))) { this is broken down bellow
            try (FileReader fileReader = new FileReader(filename); // Step 1: Create a FileReader to read character data from the file specified by filename
                    BufferedReader bufferedReader = new BufferedReader(fileReader)) { // Step 2: Wrap the FileReader in a BufferedReader to efficiently read text from the character-input stream
                String line;
                // Declares a variable line of type String to store each line read from the
                // file.
                while ((line = bufferedReader.readLine()) != null) {
                    lines.add(line); // lines.add(line) - Method adds each line read from the file to the
                    // List<String> called lines.
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return lines;
    }

    public static void copy(String inputFile, String outputFile) {
        try (FileWriter fileWriter = new FileWriter(outputFile)) {
            /* try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new BufferedWriter(outputFile))){*/
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // for ((inputFile = readFile("../resources/exercise.txt")
            List<String> lineList = readFile(inputFile);
            for (int i = 0; i < lineList.size(); i++) {
               
                if(i == (lineList.size() -1)){
                    writer.write(lineList.get(i));   
                }
                else { writer.write(lineList.get(i));
                writer.newLine();
                writer.flush();
                }
            }
        
            writer.close();

            System.out.println(lineList);
            // for (String line: readFile("../resources/exercise.txt")){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * Part 3
     * Add the following method to the FileManager class:
     * 
     * public void reverseLines(String inputFile, String outputFile)
     * read the contents of inputFile
     * write the lines to outputFile, but in reverse order; the first line will be
     * the last one, the second will be the penultimate, and so on, until the last
     * line of the original file, which should appear in the first position of the
     * resulting file.
     * create outputFile if it doesn't exist and overwrite it, if it does
     * look in this project's resources folder for both inputFile and outputFile
     * don't reuse any of the previous methods
     */

    public static void reverseLines(String inputFile, String outputFile) throws IOException {

        Path inputFilePath = Paths.get(inputFile); // create an object of the inputfile
        Path outputFilePath = Paths.get(outputFile);

        List<String> lines = Files.readAllLines(inputFilePath);// reads all lines from the file represented by the inputFilePath and returns them as a list of strings.Each element in the list corresponds to a line of text from the file.                                                     

        try (OutputStream outputStream = Files.newOutputStream(outputFilePath);
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream))) {
            Collections.reverse(lines);
            List<String> reversedLines = lines;

            // List<String> reversedLines = ((List<String>) Collections.reverse(lines));
            // Collections.reverse(lines);
            for (String line : reversedLines) {
                writer.write(line + "\r\n");
            }
            writer.close();
            // System.out.printf(inputFile, outputFile);
        }

        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

// https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html#copy-java.nio.file.Path-java.nio.file.Path-java.nio.file.CopyOption...-
// https://www.w3schools.com/java/java_files.asp
// https://www.digitalocean.com/community/tutorials/java-copy-file
// https://stackoverflow.com/questions/17169541/copy-file-in-java-and-replace-existing-target
// https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html#copy-java.nio.file.Path-java.nio.file.Path-java.nio.file.CopyOption...-
// https://www.tutorialspoint.com/java/java_files_io.htm
