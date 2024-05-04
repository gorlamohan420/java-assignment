import java.lang.reflect.Method;

public class Pro14 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = String.class;
            Method method = clazz.getMethod("nonExistentMethod"); 
        } catch (NoSuchMethodException e) {
            System.out.println("No Such Method Exception caught: " + e.getMessage());
        }
    }
}
