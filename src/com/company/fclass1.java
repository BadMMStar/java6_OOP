package com.company;

public class fclass1 {
    // The private modifier belongs only to the class where it was declared.
    // This does not work even with inheritance.
    private void method() {
        System.out.println("This main class with main method main()");
    }

    public static void main(String[] args) {
        new fclass1().method();
        new fclass2().method();
        new fclass3().method();
    }
}

class fclass3 extends fclass1 {
    protected void method(){
        System.out.println("This class extends fclass1");
    }
}

class fclass2 extends fclass3 {
    public void method() {
        System.out.println("This class extends fclass3");
    }
}