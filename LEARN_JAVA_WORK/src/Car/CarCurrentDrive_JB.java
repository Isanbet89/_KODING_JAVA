package Car;

public class CarCurrentDrive_JB {
    public static void main(String[] args) {
        double curDrive;
        Car thisCarCurDrive = new Car_JB();
        curDrive = thisCarCurDrive.currentDrive(10);
        System.out.println(curDrive);
    }
}
