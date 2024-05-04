
interface MyInterface {

    String FIELD1 = "Value1";
    int FIELD2 = 10;

    void method1();
}

class MyClass implements MyInterface {

    public void method1() {
        System.out.println("Interface method called");
    }
}

public class Pro9 {
    public static void main(String[] args) {

        System.out.println("Field1: " + MyInterface.FIELD1);
        System.out.println("Field2: " + MyInterface.FIELD2);

        MyClass obj = new MyClass();
        obj.method1();
    }
}
