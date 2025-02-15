package org.example.abstraction;

abstract class Animal {

    private String name;

    public Animal(String name){
        this.name = name;
    }
    public abstract void printmsg();


    public String getname(){
        return name;
    }
}
