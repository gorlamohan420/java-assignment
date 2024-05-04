public class Pro10 {
    public static void main(String[] args) {
        try {
            Class.forName("NonExistentClass"); 
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found Exception caught: " + e.getMessage());
        }
    }
}
