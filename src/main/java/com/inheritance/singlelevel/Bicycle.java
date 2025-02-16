package com.inheritance.singlelevel;

public class Bicycle {
    public int gear;
    public int speed;

    public Bicycle(int g,int s){
        this.gear = g;
        this.speed = s;
    }

    public void applyBreak(int dec){

        speed -= dec;
    }
    public void speedUp(int inc){
        speed += inc;
    }

    public String toString(){
         return("No of gears is "+ gear +"speed of bicycles is " +speed );
    }
}
