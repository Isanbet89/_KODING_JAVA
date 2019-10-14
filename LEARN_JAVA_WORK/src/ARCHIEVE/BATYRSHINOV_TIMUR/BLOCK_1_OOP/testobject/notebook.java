package BATYRSHINOV_TIMUR.BLOCK_1_OOP.testobject;

/**
 * Created by Isanbet on 27.05.2019.
 */

public class notebook extends computer {

    public notebook(){
        System.out.println("Notebook: Мой ноутбук");
    }

    public notebook(String name, int ram, int hdd, double weight) {
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.weight = weight;
    }

    @Override
    public void on(){
//        super.on();
        printMsg("я включился, насальника " + getName());
    }






}

