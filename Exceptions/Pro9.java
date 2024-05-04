class Pro9 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 10; // This line will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception caught: " + e.getMessage());
        }
    }
}
