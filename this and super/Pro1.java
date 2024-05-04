class MyClass {
    int field1 = 10;
    String field2 = "Hello";

    void printFields() {
        System.out.println("Field1: " + this.field1);
        System.out.println("Field2: " + this.field2);
    }
}

public class Pro1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.printFields();
    }
}
