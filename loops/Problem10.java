import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        switch (number % 2) {
            case 0:
                System.out.println(number + " is even.");
                break;
            case 1:
            case -1:
                System.out.println(number + " is odd.");
                break;
        }
    }
}
