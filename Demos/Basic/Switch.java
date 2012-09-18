//Every java file must have a class with the same name as the file
public class Switch {

    //The function that is called as soon as the file is executed
    public static void main(String[] args) {
        //Check to see if the user typed in some arguments
        if(args.length >= 1) {

            //Determine what to do based on the user's first argument
            switch(args[0]) {

                //If the first argument is secret, then print out this string
                case "secret": System.out.println("No, you may not know my secret!");

                               //This means that you want to exit the switch statement
                               //If you don't put this break in, then the next case's
                               //commands will also be executed
                               break;

                //If the first argument is please, then print out this string
                case "please": System.out.println("Fine! I'll tell you! My secret is.....that I don't have one! HAHA!");

                               //This means that you want to exit the switch statement
                               //If you don't put this break in, then the next case's
                               //commands will also be executed
                               break;

                //If none of the other cases match, then print this string
                default:       System.out.println("Try java Switch secret or java Switch please");

                               //This means that you want to exit the switch statement
                               //If you don't put this break in, then the next case's
                               //commands will also be executed
                               break;
            }
        //Since the user did not type in any arguments, execute this section
        } else {

            //Print out how to properly use this program
            System.out.println("Usage: java Switch <some_word>");
        }
    }
}
