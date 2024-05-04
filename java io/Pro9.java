import java.io.*;
import java.util.Properties;

public class Pro9 {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            InputStream inputStream = new FileInputStream("config.properties");
            properties.load(inputStream);

            String username = properties.getProperty("username");
            String password = properties.getProperty("password");

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
