import java.io.*;

public class Pro6 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            String text = "Hello, World!";
            fileWriter.write(text);
            fileWriter.close();
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
