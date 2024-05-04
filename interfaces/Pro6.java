
interface MyInterface {
    default void defaultMethod() {

    }
}

class MyClass implements MyInterface {

}

public class Pro6 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.defaultMethod();
    }
}
