public class Pro2 {
    static void myMethod(int num) {
        System.out.println("Method with int parameter: " + num);
    }

    static void myMethod(String str) {
        System.out.println("Method with String parameter: " + str);
    }

    public static void main(String[] args) {
        myMethod(10);
        myMethod("Hello");
    }
}
