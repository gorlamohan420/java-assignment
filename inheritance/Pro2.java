// Class A
class A {
    int a1 = 10;
    String a2 = "A";

    void overrideMethod() {
        System.out.println("Override method in A");
    }
}

// Class B
class B extends A {
    int b1 = 20;
    String b2 = "B";

    @Override
    void overrideMethod() {
        System.out.println("Override method in B");
    }
}

// Class C
class C extends B {
    int c1 = 30;
    String c2 = "C";

    @Override
    void overrideMethod() {
        System.out.println("Override method in C");
    }
}

// Main class
public class Pro2 {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();

        System.out.println("Data members of class A:");

        System.out.println("Data members of class B:");
        System.out.println("a1: " + objB.a1);
        System.out.println("a2: " + objB.a2);
        System.out.println("b1: " + objB.b1);
        System.out.println("b2: " + objB.b2);

        System.out.println("Data members of class C:");
        System.out.println("a1: " + objC.a1);
        System.out.println("a2: " + objC.a2);
        System.out.println("b1: " + objC.b1);
        System.out.println("b2: " + objC.b2);
        System.out.println("c1: " + objC.c1);
        System.out.println("c2: " + objC.c2);
        A objBAsA = new B();
        objBAsA.overrideMethod();

        A objCAsA = new C();
        objCAsA.overrideMethod();
    }
}
