abstract class MyAbstractClass {
    abstract void abstractMethod();

    void nonAbstractMethod() {
        System.out.println("Non-abstract method in abstract class");
    }
}

class ConcreteClass extends MyAbstractClass {
    void abstractMethod() {
        System.out.println("Abstract method implemented in ConcreteClass");
    }
}

// Main class
public class Pro1 {
    public static void main(String[] args) {
        ConcreteClass obj = new ConcreteClass();

        obj.abstractMethod();
        obj.nonAbstractMethod();
    }
}
