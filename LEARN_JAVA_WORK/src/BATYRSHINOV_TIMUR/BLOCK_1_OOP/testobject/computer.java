package BATYRSHINOV_TIMUR.BLOCK_1_OOP.testobject;

/**
 * Created by Isanbet on 24.05.2019.
 */

public class computer {

    private String name;

    private int ram;

    private int hdd;

    private double weight;


    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int newRam) {
        if (newRam > 0) {
           this.ram = newRam;
        } else {
            System.out.println("Значение не верно, значение ОЗУ не может быть отрицательным: " + newRam);
        }
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int newHdd) {
        this.hdd = newHdd;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double newWeight) {
        if (newWeight > 0) {
            this.weight = newWeight;
        } else {
            System.out.println("Значение не верно, значение ОЗУ не может быть отрицательным: " + newWeight);
        }

    }


    public void on(){
        printMsg("Компьютер включается. Модель " + name);
    }

    public void off(){
        printMsg("Компьютер выключается");
    }

    public void load(){
        printMsg("Система загружается. Объём жесткого диска " + hdd + " Гб. ОЗУ = " + ram + " Гб. Вес компа " + weight);
    }

    public void reboot(){
        printMsg("Комп перезагружается");
    }


    public void readDisk(){
        printMsg("Идёт чтение диска");
    }

    private void printMsg(String str){
        System.out.println(str);
    }

}

