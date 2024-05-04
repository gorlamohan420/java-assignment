public class Pro5 {
    static void staticMethod() {
        System.out.println("Static Method");
    }

    void instanceMethod() {
        Pro5.staticMethod();
    }

    // Main method
    public static void main(String[] args) {
        Pro5 obj = new Pro5();
        obj.instanceMethod();
    }
}
