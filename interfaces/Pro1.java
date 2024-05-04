interface MyInterface1 {
    void method1();
}

class MyClass1 implements MyInterface1 {
    public void method1() {
        System.out.println("Method 1 implemented");
    }
}

// Main class
public class Pro1 {
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();

        obj.method1();
    }
}
