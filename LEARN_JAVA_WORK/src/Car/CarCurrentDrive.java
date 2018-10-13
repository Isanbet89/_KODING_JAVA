package Car;

public class CarCurrentDrive {
    public static void main(String[] args) {
        double curDrive;
        Car thisCarCurDrive = new Car();
        curDrive = thisCarCurDrive.currentDrive(10);
        System.out.println(curDrive);
    }
}
