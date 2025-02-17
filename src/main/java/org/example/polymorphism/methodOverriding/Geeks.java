package org.example.polymorphism.methodOverriding;

public class Geeks {
    public static void main(String[] args) {
        Parent parent;
        parent = new SubChildOne();
        parent.print();

        parent= new SubChildTwo();
        parent.print();
    }
}
