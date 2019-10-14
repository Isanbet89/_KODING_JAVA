package JAVA_FOR_KIDS._old._14052019.Car;

/**
 * Created by Isanbet on 06.02.2019.
 */

public class CarOwner extends Car {

    public static void main(String[] args) {
        CarOwner carOwner = new CarOwner();

        int distance = carOwner.drive(2);
        System.out.println(distance);
    }


}

