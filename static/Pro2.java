public class Pro2 {

    int instanceVar1 = 30;
    int instanceVar2 = 40;

    static void printInstanceVariables() {
        Pro2 obj = new Pro2();
        System.out.println("Instance variable 1: " + obj.instanceVar1);
        System.out.println("Instance variable 2: " + obj.instanceVar2);
    }

    // Main method
    public static void main(String[] args) {

        printInstanceVariables();
    }
}
