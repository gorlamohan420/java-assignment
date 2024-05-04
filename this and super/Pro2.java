class ParentClass {
    int parentField = 20;
}

class ChildClass extends ParentClass {
    void printParentField() {
        System.out.println("Parent Field: " + super.parentField);
    }
}

public class Pro2 {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.printParentField();
    }
}
