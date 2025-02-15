package org.example.abstraction;

public class Main {
    public static void main(String[] args) {
        Animal d = new Dog("Tommy");
        //Dog d = new Dog("Tommy");
       d.printmsg();


       //using interface abstraction
       Circle circle = new Circle(3.6);
       System.out.println("Area of Circle is " +circle.calculateArea());

       Ractangle rect = new Ractangle(2,5);
       System.out.println("Area of Reactangle is "+rect.calculateArea());
    }
}
