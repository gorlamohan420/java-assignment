import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Pro18 {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("invalidURL", "username", "password"); 
        } catch (SQLException e) {
            System.out.println("SQL Exception caught: " + e.getMessage());
        }
    }
}
