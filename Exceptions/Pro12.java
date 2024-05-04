import java.io.IOException;

public class Pro12 {
    public static void main(String[] args) {
        try {
            throw new IOException("Custom IOException Message"); // This line will throw IOException
        } catch (IOException e) {
            System.out.println("IO Exception caught: " + e.getMessage());
        }
    }
}
