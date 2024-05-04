public class Problem12 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 25;
        int num3 = 15;
        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

       
        System.out.println("The largest number among " + num1 + ", " + num2 + ", and " + num3 + " is: " + largest);
    }
}
