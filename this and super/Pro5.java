class ParentClass {
    ParentClass() {
        System.out.println("Constructor of ParentClass");
    }
}

class ChildClass extends ParentClass {
    ChildClass() {
        super(); // Calling constructor of parent class using super()
    }
}

public class Pro5 {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
    }
}
