package com.inheritance.multiple;

public class Child implements Three{
    @Override
    public void threeInterface() {
        System.out.println("Interface three is called ");
    }

    @Override
    public void printoneInterface() {
System.out.println("Interface one is called");
    }

    @Override
    public void twoInterface() {
System.out.println("Interface two is called");
    }
}
