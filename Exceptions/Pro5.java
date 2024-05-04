public class Pro5 {
    public static void main(String[] args) {
        try {
            throw new Exception("Custom Exception Message");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
