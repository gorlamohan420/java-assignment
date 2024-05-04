public class Arithmatic {
    public static void arthimaticoperators(int a, int b) {
        System.out.println("addition" + a + b);
        int c = a - b;
        System.out.print("subtraction" + c);
        System.out.println("division " + a / b);
        System.out.println("multiplication " + a * b);
        System.out.println("modulo " + a % b);

    }

    public static void main(String[] args) {
        arthimaticoperators(5, 4);

    }
}