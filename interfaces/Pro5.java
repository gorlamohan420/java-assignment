
interface Interface1 {
    void method();
}

interface Interface2 {
    void method();
}

class MyClass implements Interface1, Interface2 {
    public void method() {
        System.out.println("Method implemented from Interface1");
    }
}

// Main class
public class Pro5 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.method();
    }
}
