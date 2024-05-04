import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter three numbers:");

        
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

    
        int largest = numbers[0];

        for (int i = 1; i < 3; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("The largest number among the three numbers is: " + largest);
        scanner.close();
    }
}
