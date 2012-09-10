//Include the FileWriter class
import java.io.FileWriter;
//Include the exception in case anything goes wrong with the writing of the file
import java.io.IOException;

//Every java file must have a class with the same name as the file
public class WritingFiles {

    //The function that is called as soon as the file is executed
    public static void main(String[] args) {
        //The content that will be written to the file
        String content = "I was written by WritingFiles.java";

        //The variable that will hold the file for writing
        FileWriter fWriter = null;

        //Try to do this code
        try {
            //Assign the file writer to a file
            fWriter = new FileWriter("write.txt");

            //Attempt to write the content to the file
            fWriter.write(content);
        
        //If the attempt to do the code throws an IOException
        //Then catch it and execute this code
        } catch(IOException exception) {
            //Write to the error output the error message of the exception
            System.err.println(exception.getMessage());

        //Whether the code succeeded or threw an exception
        //Run this code
        } finally {
            //Check to see if the file writer was assigned a file
            if(fWriter != null) {
                //Try to do this code, too
                try {
                    //Since the file writer was assigned
                    //It is now time to close it
                    fWriter.close();

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
