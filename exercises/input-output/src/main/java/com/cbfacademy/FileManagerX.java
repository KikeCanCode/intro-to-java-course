package com.cbfacademy;
/*Part 1
    Create a class called FileManager with the following methods:
    public List<String> readFile(String filename) - returns a List<String> object, 
    where each list item is a line from the specified file
    
    public void copy(String inputFile, String outputFile) 
    - copies the contents of a text file at the path defined by 
    inputFile to the path defined by outputFile. 
    Creates outputFile if it doesn't exist and overwrites it, if it does */
    import java.nio.charset.StandardCharsets;
    import java.nio.file.FileSystems;
    import java.nio.file.Files;
    import java.nio.file.Path;
    import java.nio.file.Paths;
    import java.util.List;
    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.File;
    import java.io.FileInputStream;
    import java.io.FileReader;
    import java.io.FileWriter;
    import java.io.IOException;
    import java.io.InputStream;
    import java.io.InputStreamReader;
    import java.io.OutputStream;
    import java.io.OutputStreamWriter;
    import java.io.Reader;
    import java.io.Writer;
    import java.util.ArrayList;
    
    public class FileManagerX {
      public static void main (String[] args) {
       /*File file = new File("../resources");
        for(String fileNames : file.list()) System.out.println(fileNames);
        Path p1 = Paths.get("../resources/exercise.txt");
        System.out.println(readFile("../resources/exercise.txt"));*/
    
            copy("../resources/exercise.txt","../resources/exercise2.txt" );
    
      }
            //readFile() method - indicating that the method is used for reading files.
        public static List<String> readFile(String filename){  // A method that return a String Reads the content of a file specified by the filename and returns it as a list of strings, where each string represents a line from the file.
            List<String> lines = new ArrayList<>(); 
        //(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) { this is broken down bellow
            try (FileReader fileReader = new FileReader(filename); //Step 1: Create a FileReader to read character data from the file specified by filename
            BufferedReader bufferedReader = new BufferedReader(fileReader)){ // Step 2: Wrap the FileReader in a BufferedReader to efficiently read text from the character-input stream
            String line; // Declares a variable line of type String to store each line read from the file.
            while ((line = bufferedReader.readLine()) != null) {
            lines.add(line); //lines.add(line) - Method adds each line read from the file to the List<String> called lines.
            } 
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
            return lines;
        }
    
        public static void copy(String inputFile, String outputFile)  { 
            
            try(FileWriter fileWriter = new FileWriter(outputFile)){
           // try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            //BufferedWriter writer = new BufferedWriter(new BufferedWriter(outputFile))){ 
               BufferedWriter writer = new BufferedWriter(fileWriter); 
    
           // for ((inputFile = readFile("../resources/exercise.txt")
            List <String> lineList = readFile(inputFile);
            for(int i= 0; i < lineList.size(); i++) {
                writer.write(lineList.get(i));
                writer.newLine();
                //System.out.println(lineList);
    
            }
            //for (String line: readFile("../resources/exercise.txt")){
    
                }
                catch (IOException e) {
                    e.printStackTrace();
               }
        }
    }
       // reader.readLine()) != null) {      
  
 
/* Part 3
Add the following method to the FileManager class:

public void reverseLines(String inputFile, String outputFile)
read the contents of inputFile
write the lines to outputFile, but in reverse order; the first line will be the last one, the second will be the penultimate, and so on, until the last line of the original file, which should appear in the first position of the resulting file.
create outputFile if it doesn't exist and overwrite it, if it does
look in this project's resources folder for both inputFile and outputFile
don't reuse any of the previous methods*/
   
//public static void reverseLines(String inputFile, String outputFile){
        
//List<String> reversedLines = readFile(inputFile);
    
    //ArrayList<Integer> reversed = new ArrayList<>(numbers);
    //Path path = FileSystems.getDefault().getPath("logs", "access.log");
     //BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
 
//Path p1 = Paths.get("../resources/exercise.txt");
// Step 1: Construct a Path object representing the file path
//Path filePath = Paths.get("resources", inputFile);

// Step 2: Read all lines from the file
//List<String> lines = Files.readAllLines(filePath);
        /*public void copy(String inputFile, String outputFile) copies the contents of a text file at the path defined by 
        inputFile to the path defined by outputFile.*/
    /* // Step 1: Create a Path object representing the source file
Path sourcePath = Paths.get(inputFile);

// Step 2: Create a Path object representing the destination file
Path destinationPath = Paths.get(outputFile);

// Step 3: Call Files.copy() to copy the contents of the source file to the destination file
Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
private static void copyFileUsingStream(File source, File dest) throws IOException {
    InputStream is = null;
    OutputStream os = null;
    try {
        is = new FileInputStream(source);
        os = new FileOutputStream(dest);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer)) > 0) {
            os.write(buffer, 0, length);
        }
    } finally {
        is.close();
        os.close();
    }
}

       // public void copy (String inputFile, Writer outputFile){ 
    
 
        public static void main (String[] args) {
           FileManager FileManager = new FileManager();
            
            List<String> lines = FileManager.readFile("exercise.txt");
        
        for (String line : lines) {
           // System.out.println(lines);
        }
        File.copy("input.txt", "output.txt");
     
        }
}*/
//https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html#copy-java.nio.file.Path-java.nio.file.Path-java.nio.file.CopyOption...-
//https://www.w3schools.com/java/java_files.asp
//https://www.digitalocean.com/community/tutorials/java-copy-file
//https://stackoverflow.com/questions/17169541/copy-file-in-java-and-replace-existing-target
//https://docs.oracle.com/javase/8/docs/api/java/nio/file/Files.html#copy-java.nio.file.Path-java.nio.file.Path-java.nio.file.CopyOption...-
//   https://www.tutorialspoint.com/java/java_files_io.htm    
        