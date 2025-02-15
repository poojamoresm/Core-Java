package org.example.abstraction;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void printmsg() {
        System.out.println(getname() );
    }
}
