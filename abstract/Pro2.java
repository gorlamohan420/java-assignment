abstract class MyAbstractClass {
    abstract void abstractMethod();

    void nonAbstractMethod() {
        System.out.println("Non-abstract method in abstract class");
    }
}

class SubClass extends MyAbstractClass {
    void abstractMethod() {
        System.out.println("Abstract method implemented in SubClass");
    }

    void subClassMethod() {
        System.out.println("Method specific to SubClass");
    }
}

// Main class
public class Pro2 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.nonAbstractMethod();
        obj.abstractMethod();
        obj.subClassMethod();
    }
}
