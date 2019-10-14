package VASILYEV_SAMOUCHITEL_JAVA.arrays;

/**
 * Created by Isanbet on 08.10.2018.
 */

public class array1 {
    public static void main(String[] args) {
        int[ ] arr = new int[5];

        String[ ] myNames = { "A", "B", "C", "D"};
        System.out.println(myNames[2]);

        System.out.println(myNames.length); //Длина (ёмкость) массива


        int [ ] myArr = {6, 42, 3, 7};
        int sum=0;
        for(int x=0; x<myArr.length; x++) {
            sum += myArr[x];
        }
        System.out.println(sum);
    }
}

