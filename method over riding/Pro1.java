public class Pro1 {

    static void myMethod(int num) {
        System.out.println("Method with one parameter: " + num);
    }

    static void myMethod(int num1, int num2) {
        System.out.println("Method with two parameters: " + num1 + ", " + num2);
    }

    public static void main(String[] args) {
        myMethod(10);
        myMethod(20, 30);
    }
}
