package com.cbfacademy;
/* Create a class called FileExtension with the following methods:

boolean check(String filename)
Map<String, int> map(List<String> filenames)
The check method should:

return true when the file extension is .java
return false when the file extension is not .java 
throw a custom checked exception called FilenameException (that you must create) when the file name is null or an empty string.
The map method should:

check each provided file's extension and map the returned value as 1 if true or 0 if false
map -1 when an exception occurs*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class FileExtension {
      
    public boolean check (String filename) throws FilenameException { // Constroctor for boolean with a throw 
        if(filename != null){
            if(filename.isBlank()){
                throw new FilenameException("The file name is an empty string"); 
            }
            else if(filename.endsWith(".java")){
                return true; // return true when the file extension is .java
            }
            else {
                return false; // return false when the file extension is not .java
            }
        }
        else{
            throw new FilenameException("The file name is null.");
        }
        
       /*  if (filename.isBlank()){  // if statement checking if the finename is || represent OR
            throw new FilenameException( "File name is empty"); // throw exception statement
        } 
        else if (filename == null){
           throw new FilenameException( "File name is not java or null");
        }
        else if(filename.endsWith(".java")){ // if statement to check if the file ends with .java - 
            return true;
        } 
        else {
            return false; // if not - return flase
        }*/
    }   
        //The map method should:
        //check each provided file's extension and map the returned value as 1 if true or 0 if false map -1 when an exception occur
        
        public Map<String, Integer> map(List<String> filenames) {
            Map<String, Integer> filenamesMap = new HashMap<>();
            filenames.forEach((filename) -> {
                try {
                    if(check(filename) == true){
                        filenamesMap.put(filename, 1);
                    }
                    else{
                        filenamesMap.put(filename, 0);
                    }
                } 
                catch (FilenameException e) {
                    if(e.getMessage().contains("null")){
                        filenamesMap.put(null, -1);
                    }
                    else{
                        filenamesMap.put("", -1);
                    }
                }
            }); 
           /* Map<String, Integer> filenamesMap = new HashMap<>();
        try{ 
        for (String string : filenames) {  //check each provided file's extension and map the returned value as 1 if true or 0 if falsemap -1 when an exception occurs
        
        if (check(string) == true){
            filenamesMap.put(string, 1);
        }
        else{
            filenamesMap.put(string, 0);
        }
        }
        }
        catch (FilenameException e) {

            if(e.getMessage().contains("null")){

                filenamesMap.put(null, -1);
            }
            else{
                filenamesMap.put("", -1);
            }
           // filenamesMap.put(null, -1);*/
    
            return filenamesMap;
    }
}


    

    
        
