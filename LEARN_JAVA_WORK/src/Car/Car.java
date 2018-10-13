package Car;

public class Car {
    String model; //Марка
    String color; //Цвет
    int currentDrive=0; //Текущее расстояние

    public void start(String aWord){

    };

    public void stop(String aWord) {

    }

    //Вычисляет расстояние, пройденное за переданное в методе (функции) время на скорости 60 км/час
    public int currentDrive(int howLong){
        currentDrive=60*howLong;
        return currentDrive;
    }
}
