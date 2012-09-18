//Import the necessary SQL classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
    public static void main(String[] args) {
        try {
            //Create a connection to the mysql server
            //First argument: jdbc:mysql://{host}/{database}
            //Second argument: username
            //Third argument: password
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/java_demos", "username", "password");

            //Create a prepared statement
            //These allow you to send a query to a server and later define what the variables are supposed to be
            PreparedStatement stat = connect.prepareStatement("SELECT * FROM my_table WHERE id = ?");

            //Assign the first ? in the query to be the string 1
            stat.setString(1, "1");
            //Execute the query and store the results into a variable
            ResultSet results = stat.executeQuery();

            //While there is another row, assign results to point to it
            while(results.next()) {
                //Print out the results by getting the result with the column name
                System.out.println("Column_1: " + results.getString("Column_1"));
            }

        //If something goes wrong, please catch the exception
        } catch (SQLException exception) {
            //Print the exception stack trace
            exception.printStackTrace();
        }
    }
}
