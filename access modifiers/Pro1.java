class Pro1 {

    private int privateField1 = 10;
    private String privateField2 = "Hello";

    private void privateMethod() {
        System.out.println("Private Method");
    }

    public static void main(String[] args) {
        Pro1 obj = new Pro1();

        System.out.println("Private Field 1: " + obj.privateField1);
        System.out.println("Private Field 2: " + obj.privateField2);
        obj.privateMethod();
    }
}

class SubClass extends Pro1 {

    void accessPrivateMembers() {

    }
}
