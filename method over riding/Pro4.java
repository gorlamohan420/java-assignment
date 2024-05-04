public class Pro4 {
    static void myMethod(int num, String str) {
        System.out.println("Method with int and String parameters: " + num + ", " + str);
    }

    static void myMethod(String str, int num) {
        System.out.println("Method with String and int parameters: " + str + ", " + num);
    }

    public static void main(String[] args) {

        myMethod(10, "Hello");
        myMethod("Hello", 10);
    }
}
