


interface MyInterface3 {
    void method();
}

class MyClass3 implements MyInterface3 {
    public void method() {
        System.out.println("Method implemented");
    }
}

// Main class
public class Pro3 {
    public static void main(String[] args) {
        MyInterface3 obj = new MyClass3();
        
        obj.method();
    }
}
