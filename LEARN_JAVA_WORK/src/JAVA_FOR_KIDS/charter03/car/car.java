package JAVA_FOR_KIDS.charter03.car;

/**
 * Created by Isanbet on 15.05.2019.
 */

public class car {
    int distance = 0;

    public void start(){
        System.out.println("Начинаю движение");
    }

    public void stop(){
        System.out.println("Завершаю движение");
    }

    public int drive(int howLongTime){
        distance = howLongTime * 60;
        return distance;
    }
}

