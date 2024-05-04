
abstract class MyAbstractClass {

    void nonAbstractMethod() {
        System.out.println("Non-abstract method in abstract class");
    }
}

class SubClass extends MyAbstractClass {

    void nonAbstractMethod() {
        SubClass obj = new SubClass();
        obj.nonAbstractMethod();
    }
}

// Main class
public class Pro4 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();

        obj.nonAbstractMethod();
    }
}
