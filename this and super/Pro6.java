class MyClass {
    int field = 10;

    void method() {
        System.out.println("Method in MyClass");
    }

    void callOtherMethod() {
        this.method();
        superMethod();
    }

    void superMethod() {
        System.out.println("Super Method in MyClass");
    }
}

public class Pro6 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.callOtherMethod();
    }
}
