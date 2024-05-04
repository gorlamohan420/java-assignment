import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        if(isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    // Function to check if a number is Armstrong or not
    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;

        // Assigning the number to a temporary variable
        originalNumber = number;

        // Calculating the number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        // Assigning the number to a temporary variable again
        originalNumber = number;

        // Finding the sum of digits raised to the power n
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        // Checking if number is equal to the sum of its own digits each raised to the power of the number of digits
        if (result == number) {
            return true;
        } else {
            return false;
        }
    }
}
