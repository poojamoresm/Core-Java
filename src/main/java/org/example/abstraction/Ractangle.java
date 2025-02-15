package org.example.abstraction;

public class Ractangle implements Shape{
    private double width;
    private double length;

    public Ractangle(double w, double l){
        this.length =l;
        this.width = w;
    }

    @Override
    public double calculateArea() {
        return width*length;
    }
}
