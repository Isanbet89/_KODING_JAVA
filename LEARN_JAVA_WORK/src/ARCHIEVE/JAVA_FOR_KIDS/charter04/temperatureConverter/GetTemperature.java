package JAVA_FOR_KIDS.charter04.temperatureConverter;

import JAVA_DUMMIES.TEMPERATURE.Temperature;

/**
 * Created by Isanbet on 15.05.2019.
 */

public class GetTemperature {
    public static void main(String[] args) {
        convertTemp convertTemp = new convertTemp();

        String result = convertTemp.convertTemp(20,'C');

        System.out.println(result);


    }
}

