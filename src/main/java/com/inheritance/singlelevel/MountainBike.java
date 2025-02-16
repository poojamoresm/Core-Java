package com.inheritance.singlelevel;

public class MountainBike extends Bicycle {

    public  int seatHeight;

    public MountainBike(int gear, int speed,
                        int sh){
        super(gear,speed);
        this.seatHeight = sh;
    }
    public void setSeatHeight(int height){
        seatHeight = height;
    }

    public String toString(){
        return (super.toString()+"Height of mountain bycycle seat is "+ seatHeight);
    }
}
