//Include the BufferedReader class
import java.io.BufferedReader;
//Include the FileReader class
import java.io.FileReader;
//Include the exception in case anything goes wrong with reading the file
import java.io.IOException;

//Every java file must have a class with the same name as the file
public class TryCatchResources {

    //The function that is called as soon as the file is executed
    //If the IOException is thrown and not caught
    //Then it throws the exception to what called our main function
    public static void main(String[] args) throws IOException {
        //Try to do this code
        //Creates a FileReader and BufferedReader variables
        //The variables that are created will automatically be closed when the try block is finished executing
        try (FileReader fReader = new FileReader("TryCatchResources.java");
                BufferedReader bReader = new BufferedReader(fReader)) {
            //The variable to store the current line of the file
            String line;

            //As long as there is another line in the file
            //Grab the line and store it into the string variable
            while((line = bReader.readLine()) != null) {
                //Print out the current line of the file
                System.out.println(line);
            }
        //If the attempt to do the code throws an IOException
        //Then catch it and execute this code
        //Does not catch the IOException thrown if the FileReader or BufferedReader fails to be instantiated
        } catch(IOException exception) {
            //Write to the error output the exception
            System.err.println(exception);
        }
    }
}
