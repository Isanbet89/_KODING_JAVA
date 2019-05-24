package JAVA_FOR_KIDS.charter04.temperatureConverter;

/**
 * Created by Isanbet on 15.05.2019.
 */

public class convertTemp {
    public String convertTemp(int temperature, char convertTo){

        switch (convertTo){
            case 'F':
                temperature = temperature * 20;
                break;

            case 'C':
                temperature = temperature * 10;
                break;
        }

        String result = "Температура = " + temperature;
        return result;

    }


}

