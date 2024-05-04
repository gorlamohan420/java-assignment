class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Pro6 {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom Exception Message");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
