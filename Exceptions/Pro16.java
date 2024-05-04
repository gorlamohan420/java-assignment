public class Pro16 {
    public static void main(String[] args) {
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception caught: " + e.getMessage());
        }
    }
}
