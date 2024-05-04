public class Pro5 {

    static int myMethod(int num) {
        return num * num;
    }

    static double MyMethod(int num) {
        return Math.sqrt(num);
    }

    public static void main(String[] args) {
        System.out.println("Square of 4: " + myMethod(4));
        System.out.println("Square root of 9: " + MyMethod(9));
    }
}
