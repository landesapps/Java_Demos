//The location of the file
package Demos.Basic;

//Include the Scanner class
import java.util.Scanner;

//Every java file must have a class with the same name as the file
public class CommandLineReader {

    //The function that is called as soon as the file is executed
    public static void main(String[] args) {
        //The scanner that reads the users input
        Scanner scan = new Scanner(System.in);

        //A String variable that will hold the user's input
        String input;

        //Inform the user to type in some input
        System.out.print("Enter a sentence: ");

        //Grab all of the input on the current line and store it in the input variable
        input = scan.nextLine();

        //Print out the user's input
        System.out.println("You said: " + input);
    }
}
