package JAVA_FOR_KIDS._old._14052019.Car;

/**
 * Created by Isanbet on 06.02.2019.
 */

public class JBCar extends Car {

    public int drive(int howLong){
        int distance = howLong * 180;
        return distance;
    }

    public static void main(String[] args) {
        JBCar jbCar = new JBCar();

        int distance = jbCar.drive(2);
        System.out.println(distance);

    }
}

