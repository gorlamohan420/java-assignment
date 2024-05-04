public class Pro6 {
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    int instanceVar1 = 30;
    int instanceVar2 = 40;

    public static void main(String[] args) {
        System.out.println("Static variable 1: " + staticVar1);
        System.out.println("Static variable 2: " + staticVar2);

        Pro6 obj = new Pro6();

        System.out.println("Instance variable 1: " + obj.instanceVar1);
        System.out.println("Instance variable 2: " + obj.instanceVar2);
    }
}
