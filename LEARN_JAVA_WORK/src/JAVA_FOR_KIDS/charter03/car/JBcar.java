package JAVA_FOR_KIDS.charter03.car;

/**
 * Created by Isanbet on 15.05.2019.
 */

public class JBcar extends car {
    int distance = 0;

    public int drive(int howLongTime){
        distance = howLongTime * 180;
        return distance;
    }
}

