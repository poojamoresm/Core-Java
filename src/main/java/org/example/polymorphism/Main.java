package org.example.polymorphism;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.fun();

        child.fun(3);

        Parent p = new Parent();
        p.fun(2);
        p.fun();

        Father f = new Father();
        f.role();
    }
}
