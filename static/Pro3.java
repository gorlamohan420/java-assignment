public class Pro3 {

    static int staticVar1 = 10;
    static int staticVar2 = 20;

    void printStaticVariables() {

        System.out.println("Static variable 1: " + staticVar1);
        System.out.println("Static variable 2: " + staticVar2);
    }

    // Main method
    public static void main(String[] args) {
        Pro3 obj = new Pro3();
        obj.printStaticVariables();
    }
}
