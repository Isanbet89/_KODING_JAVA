package BATYRSHINOV_TIMUR.BLOCK_1_OOP.testobject;

/**
 * Created by Isanbet on 24.05.2019.
 */

public class computerWork {

    public static void main(String[] args) {

        //инициализируем конструктор
        computer comp = new computer("Вася",2,350, 100.5);

        comp.on();
        comp.load();
        comp.off();
        comp.reboot();
        comp.readDisk();
        comp.scanDisk();

        notebook note = new notebook("Петя",4,450, 101.5);
        note.on();
        note.load();
        note.off();

    }

}

