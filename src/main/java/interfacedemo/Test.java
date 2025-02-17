package interfacedemo;

public class Test {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.speedUp(1);
        bicycle.applyBreak(2);
        bicycle.changeGear(3);
        bicycle.printStates();

        Bike bike = new Bike();
        bike.changeGear(3);
        bike.applyBreak(1);
        bike.speedUp(2);

        bike.printikeState();
    }
}
