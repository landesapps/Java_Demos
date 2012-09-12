//Every java file must have a class with the same name as the file
public class TryCatchFinally {

    //The function that is called as soon as the file is executed
    public static void main(String[] args) {
        //Try to do this code
        try {
            //Throw an exception
            //Usually thrown when an unexpected issue occurs
            throw new Exception("Exception was thrown");

        //If the attempt to do the code throws an Exception
        //Then catch it and execute this code
        } catch(Exception exception) {
            //Write to the error output the exception
            System.err.println(exception);

        //Whether the code succeeded or threw an exception
        //Run this code
        } finally {
            //Write to the output this message
            System.out.println("Why, hello there!");
        }
    }
}
