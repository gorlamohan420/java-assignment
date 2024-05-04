class MyClass {
    int value;

    
    MyClass() {
        this(0); 
    }

    MyClass(int value) {
        this.value = value;
        System.out.println("Constructor invoked with value: " + value);
    }
}

public class Pro3 {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();  
        MyClass obj2 = new MyClass();
    }
}
