//The location of the file
package Demos.Basic;

//Include the FileReader class
import java.io.FileReader;
//Include the BufferedReader class
import java.io.BufferedReader;
//Include the exception in case anything goes wrong with reading the file
import java.io.IOException;

//Every java file must have a class with the same name as the file
public class ReadingFiles {

    //The function that is called as soon as the file is executed
    public static void main(String[] args) {
        //The variable that will hold the file for reading
        FileReader fReader = null;

        //The variable that will read the actual file
        BufferedReader bReader = null;

        //The variable to store the current line of the file
        String line;

        //Try to do this code
        try {
            //Assign the file reader to a file
            fReader = new FileReader("Demos/Basic/HelloWorld.java");
            
            //Assign the buffered reader to the file reader's file
            bReader = new BufferedReader(fReader);

            //As long as there is another line in the file
            //Grab the line and store it into the string variable
            while((line = bReader.readLine()) != null) {
                //Print out the current line of the file
                System.out.println(line);
            }
        
        //If the attempt to do the code throws an IOException
        //Then catch it and execute this code
        } catch(IOException exception) {
            //Write to the error output the error message of the exception
            System.err.println(exception.getMessage());
       
        //Whether the code succeeded or threw an exception
        //Run this code
        } finally {
            //Check to see if the file reader ever was assigned a variable
            if(fReader != null) {
                //Try to do this code, too
                try {
                    //Since the file reader was assigned
                    //it is now time to close it
                    fReader.close();
                
                //If the attempt to do the code throws an IOException
                //Then catch it and execute this code
                } catch(IOException exception) {
                    //Write to the error output the error message of the exception
                    System.err.println(exception.getMessage());
                }
            }
        }
    }
}
