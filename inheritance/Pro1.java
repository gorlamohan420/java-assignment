// Class A
class A {
    void methodA1() {
        System.out.println("Method A1");
    }

    void methodA2() {
        System.out.println("Method A2");
    }

    void overrideMethod() {
        System.out.println("Override method in A");
    }
}

// Class B
class B extends A {
    void methodB1() {
        System.out.println("Method B1");
    }

    void methodB2() {
        System.out.println("Method B2");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override method in B");
    }
}

// Class C
class C extends B {
    void methodC1() {
        System.out.println("Method C1");
    }

    void methodC2() {
        System.out.println("Method C2");
    }

    @Override
    void overrideMethod() {
        System.out.println("Override method in C");
    }
}

// Main class
public class Pro1 {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();
        objA.methodA1();
        objA.methodA2();
        objA.overrideMethod();
        objB.methodB1();
        objB.methodB2();
        objB.overrideMethod();
        objC.methodC1();
        objC.methodC2();
        objC.overrideMethod();
        A objBAsA = new B();
        objBAsA.overrideMethod();

        A objCAsA = new C();
        objCAsA.overrideMethod();
    }
}
