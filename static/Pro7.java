public class Pro7 {
    static void staticMethod() {
        System.out.println("Static Method");
    }

    void instanceMethod() {
        System.out.println("Instance Method");
    }

    public static void main(String[] args) {
        staticMethod();
        Pro7 obj = new Pro7();
        obj.instanceMethod();

    }
}