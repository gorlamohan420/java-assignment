public class Pro5 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        boolean condition1 = true;
        boolean condition2 = false;

        // Logical AND (&&)
        if (num1 < num2 && condition1) {
            System.out.println("Both conditions are true.");
        } else {
            System.out.println("At least one condition is false.");
        }

        // Logical OR (||)
        if (num1 < num2 || condition2) {
            System.out.println("At least one condition is true.");
        } else {
            System.out.println("Both conditions are false.");
        }

        // Logical NOT (!)
        if (!condition2) {
            System.out.println("Condition is false.");
        } else {
            System.out.println("Condition is true.");
        }
    }
}
