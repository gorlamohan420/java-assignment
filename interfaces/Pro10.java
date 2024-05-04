
interface MyInterface {
    String FIELD1 = "Value1";
    int FIELD2 = 10;

    default String getField1() {
        return FIELD1;
    }

    default int getField2() {
        return FIELD2;
    }

    void method1();
}

class MyClass implements MyInterface {

    public void method1() {
        System.out.println("Interface method called");
    }
}

public class Pro10 {
    public static void main(String[] args) {

        System.out.println("Field1: " + MyInterface.FIELD1);
        System.out.println("Field2: " + MyInterface.FIELD2);

        MyClass obj = new MyClass();
        obj.method1();
    }
}
