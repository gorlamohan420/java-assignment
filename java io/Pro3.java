import java.io.*;

public class Pro3 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new BufferedInputStream(new FileInputStream("input.txt"));
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
