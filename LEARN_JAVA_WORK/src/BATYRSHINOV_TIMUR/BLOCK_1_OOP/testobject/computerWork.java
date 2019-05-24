package BATYRSHINOV_TIMUR.BLOCK_1_OOP.testobject;

/**
 * Created by Isanbet on 24.05.2019.
 */

public class computerWork {

    public static void main(String[] args) {

        computer comp = new computer();

        comp.setName("Вася");
        comp.setRam(-300);
        comp.setHdd(300);
        comp.setWeight(100.5);

        comp.on();
        comp.load();
        comp.off();
        comp.reboot();
        comp.readDisk();

    }

}

