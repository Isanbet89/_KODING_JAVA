package Car;

public class Car_JB extends Car{
    int currentDrive=0;
    //Вычисляет расстояние, пройденное за переданное в методе (функции) время на скорости 60 км/час
    public int currentDrive(int howLong){
        currentDrive=180*howLong;
        return currentDrive;
    }
}
