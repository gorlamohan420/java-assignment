public class Pro15 {
    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length(); 
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception caught: " + e.getMessage());
        }
    }
}
