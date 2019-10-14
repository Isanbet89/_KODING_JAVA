package VASILYEV_SAMOUCHITEL_JAVA.arrays;

import javax.swing.*;

//Самоучитель JAVA с примерами и программами
public class TwoArray {
    public static void main(String[] args) {
        Arrays();
    }

    public static void  Arrays(){
        //Индексная переменная и количество элементов
        int i,j, n,m;

        String text = "Массив из нечётных чисел:\n";

        //Ввод размера массива
        n = Integer.parseInt(JOptionPane.showInputDialog("Укажите число строк массива:"));
        m = Integer.parseInt(JOptionPane.showInputDialog("Укажите число строк массива:"));

        //Создание массива
        int[][] nums = new int[n][m];

        //Заполнение массива и формирование текста для вывода
        for(i=0;i<n;i++){
            text+="\n";
                for(j=0;j<m;j++){
                    nums[i][j]=(int)(10*Math.random());
                    text+=nums[i][j]+" ";

                }
        }

        //Вывод окна сообщения
        JOptionPane.showMessageDialog(null,text);
    }
}


