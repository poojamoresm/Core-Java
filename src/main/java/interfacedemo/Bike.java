package interfacedemo;

public class Bike implements Vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void applyBreak(int newBreak) {
        speed -= newBreak;
    }

    @Override
    public void speedUp(int newSpeed) {

        speed += newSpeed;
    }

    public void printikeState(){
        System.out.println("Change bike gear is "+ gear + "Change bike speed is "+ speed);
    }
}
