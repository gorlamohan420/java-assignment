public class Pro17{
    public static void main(String[] args) {
        try {
            String str = "hello";
            char ch = str.charAt(10); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out Of Bounds Exception caught: " + e.getMessage());
        }
    }
}
