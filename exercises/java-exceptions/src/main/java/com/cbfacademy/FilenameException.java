package com.cbfacademy;
/* Custom Exceptions
Create a custom (checked) exception class called FilenameException.

Create a class called FileExtension with the following methods:

boolean check(String filename)
Map<String, int> map(List<String> filenames)
The check method should:

return true when the file extension is .java
return false when the file extension is not .java 
throw a custom checked exception called FilenameException (that you must create) when the file name is null or an empty string.
The map method should:

check each provided file's extension and map the returned value as 1 if true or 0 if false
map -1 when an exception occurs*/

public class FilenameException extends Exception {

    String message;

    public FilenameException (String message){ 

        //super(message);
        this.message = message;

    }


@Override
public String getMessage(){
    return this.message;
}
}


// 
//solve or build?
// conception
//steps 
// system somewhere, and my system will valid if the file has the right extension or not. if java true or false if not? implementation details
// 