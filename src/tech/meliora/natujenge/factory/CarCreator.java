package tech.meliora.natujenge.factory;

public class CarCreator {

    public static void main(String[] args) {
        ICar car = CarFactory.getInstance("look");

        drive(car);
    }

    public static void drive(ICar car){
        car.start();
        car.shiftUp();
        car.accelerate();
        car.shiftDown();
        car.brake();
        car.stop();
    }

}
