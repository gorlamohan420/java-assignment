import java.lang.reflect.Field;

public class Pro13 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = String.class;
            Field field = clazz.getField("nonExistentField"); // This line will throw NoSuchFieldException
        } catch (NoSuchFieldException e) {
            System.out.println("No Such Field Exception caught: " + e.getMessage());
        }
    }
}
