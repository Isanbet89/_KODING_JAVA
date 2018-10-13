package VASILYEV_SAMOUCHITEL_JAVA.arrays;

import javax.swing.*;

//Самоучитель JAVA с примерами и программами
public class singleArray {
    public static void main(String[] args) {
        Array();
    }

    public static void  Array(){
        //Индексная переменная и количество элементов
        int i, size;

        String text = "Массив из нечётных чисел:\n";

        //Ввод размера массива
        size = Integer.parseInt(JOptionPane.showInputDialog("Укажите размер массива:"));

        //Создание массива
        int[] nums = new int[size];

        //Заполнение массива и формирование текста для вывода
        for(i=0;i<size;i++){
            nums[i]=2*i+1;
            //Или также задаём с клавиатуры
            //nums[i]=Integer.parseInt(JOptionPane.showInputDialog("Введите элемент массива №:" + i));
            text+=nums[i]+" ";
        }

        //Вывод окна сообщения
        JOptionPane.showMessageDialog(null,text);
    }
}


