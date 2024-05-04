public class Pro4 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }
}
