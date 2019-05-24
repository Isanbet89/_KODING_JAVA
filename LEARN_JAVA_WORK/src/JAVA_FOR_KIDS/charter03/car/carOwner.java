package JAVA_FOR_KIDS.charter03.car;

/**
 * Created by Isanbet on 15.05.2019.
 */

public class carOwner {

    public static void main(String[] args) {
        car myCar = new car();

        myCar.start();

        int distance;
        distance = myCar.drive(2);
        System.out.println("Проехал " + distance + " километров");

        myCar.stop();
    }


}

