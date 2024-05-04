public class Pro4 {
    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    static void staticMethod() {
        Pro4 obj = new Pro4();
        obj.instanceMethod1();
    }

    // Main method
    public static void main(String[] args) {
        staticMethod();
    }
}
