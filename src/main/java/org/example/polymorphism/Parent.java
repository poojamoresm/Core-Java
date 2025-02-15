package org.example.polymorphism;

public class Parent {
    public void fun(){
        System.out.println("Method overloading");
    }

    public void fun(int a){
        System.out.println("Method overloading with int parameter" +a);
    }
}
