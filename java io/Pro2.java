import java.io.*;

public class Pro2 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("output.txt");
            String text = "Hello, World!";
            outputStream.write(text.getBytes());
            outputStream.close();
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
