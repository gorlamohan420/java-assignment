import java.io.*;

public class Pro8 {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));
            String text = "Hello, World!";
            bufferedWriter.write(text);
            bufferedWriter.close();
            System.out.println("Text written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
