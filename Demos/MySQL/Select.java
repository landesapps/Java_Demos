import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
    public static void main(String[] args) {
        try {
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/java_demos", "username", "password");
            PreparedStatement stat = connect.prepareStatement("SELECT * FROM my_table WHERE id = ?");

            stat.setString(1, "1");
            ResultSet results = stat.executeQuery();

            while(results.next()) {
                System.out.println("Column_1: " + results.getString("Column_1"));
            }

        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
