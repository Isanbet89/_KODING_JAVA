package VASILYEV_SAMOUCHITEL_JAVA.variables;

public class Class_Shell {
    public static void main(String[] args) {
        //Классы-оболочки существуют для базовых типов
        int Number = 321;
        String notNumber = "123";

        int aNumber = Integer.parseInt(notNumber);
        System.out.println("Строка " + notNumber + " превратилась в число " + aNumber);

        char textChar = 'A';
        String textString = Character.toString(textChar);
        System.out.println(textString);

        //а это прямое преобразование, уже не класс-обёртка (класс-оболочка)
        double percent = 1.75;
        int percentInt = (int) percent;
        System.out.println(percentInt);

        //остаток от деления
        int delimoe = 10;
        int delitel = 3;
        double chastnoe = (double)delimoe/delitel;
        double ostatok = (double)delimoe%delitel;
        String ostatokDrob = Double.toString(chastnoe % 1).substring(2);
        Double ostatokDrob2 = Double.parseDouble(ostatokDrob);
        System.out.format("%.5f%n", chastnoe);
        System.out.println(ostatok);
        System.out.println(ostatokDrob);
        System.out.println(ostatokDrob2);
        //double
    }
}


