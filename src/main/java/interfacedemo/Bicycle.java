package interfacedemo;

public class Bicycle implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void applyBreak(int dec) {
       speed -=dec;
    }

    @Override
    public void speedUp(int inc) {
 speed += inc;

    }

    public void printStates(){
        System.out.println("Speed od bicycle is " +speed+ " Gear is " + gear);
    }
}
