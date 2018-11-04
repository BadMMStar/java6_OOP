package com.company;

public class fclass1_2task {

    public static void main(String[] args) {
        fclass2_2task test = new fclass2_2task("Michael", 19);
        test.displayInfo();
    }

}

// In this class, you can use all the modifiers for variables.
// However, the private modifier does not work in the class because it is tied to the class.

class fclass2_2task {
    protected String name;
    private int age;

    protected fclass2_2task(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void displayInfo() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}
