import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Pro11 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(new File("nonExistentFile.txt")); // This line will throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found Exception caught: " + e.getMessage());
        }
    }
}
