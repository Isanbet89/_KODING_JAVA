package Temperature;

public class TemperatureConverter {
    int temperature;
    char convertTo;

    public void tempConvertTo() {
        convertTo = 'C';

        if (convertTo == 'F'){
            System.out.println("Фаренгейт");
        } else if (convertTo == 'C') {
            System.out.println("Цельсий");
        }
    }

}
