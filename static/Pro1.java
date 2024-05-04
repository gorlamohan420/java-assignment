public class Pro1 {
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    int instanceVar1 = 30;
    int instanceVar2 = 40;

    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");

        System.out.println("Static variable 1: " + staticVar1);
        System.out.println("Static variable 2: " + staticVar2);

        Pro1 obj = new Pro1();

        System.out.println("Instance variable 1: " + obj.instanceVar1);
        System.out.println("Instance variable 2: " + obj.instanceVar2);

        // Calling static methods
        staticMethod1();
        staticMethod2();

        // Calling instance methods
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}
