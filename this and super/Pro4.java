class MyClass {
    int value1;
    int value2;

    // Constructor with two arguments
    MyClass(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
        System.out.println("Constructor invoked with value1: " + value1 + " and value2: " + value2);
    }

    // Constructor with one argument (uses this() to call the two-argument constructor with default value)
    MyClass(int value) {
        this(value, 0); // Calls the two-argument constructor with default value for value2
    }
}

public class Pro4{
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10, 20); 
        MyClass obj2 = new MyClass(5); 
    }
}
