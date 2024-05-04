
interface MyInterface2 {
    void method1();

    void method2();
}

class MyClass2 implements MyInterface2 {

    public void method1() {
        System.out.println("Method 1 implemented");
    }

    public void method2() {

    }
}

public class Pro2 {
    public static void main(String[] args) {
        MyClass2 obj = new MyClass2();

        obj.method1();
    }
}
