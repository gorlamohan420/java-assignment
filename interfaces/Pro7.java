
interface Interface1 {
    void method1();
}

interface Interface2 extends Interface1 {
    void method2();
}

class MyClass implements Interface2 {

    public void method1() {
        System.out.println("Method 1 implemented from Interface1");
    }

    public void method2() {
        System.out.println("Method 2 implemented from Interface2");
    }
}

public class Pro7 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.method1();
        obj.method2();
    }
}
