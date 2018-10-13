package VASILYEV_SAMOUCHITEL_JAVA.classes_methodes;


import javax.swing.*;

//Самоучитель JAVA с примерами и программами
public class Class_one {
    int num;
    char symb;
    String text;

    //Метод для отображения сообщения
    void showText() {
        String str = "Значения полей объекта:\n";
        //Формирование результата
        str += "num=" + num + "\n";
        str += "symb=" + symb + "\n";
        str += "text=" + text;

        //Отображает окно сообщения
        JOptionPane.showMessageDialog(null, str);
    }


    //Присвоение значений полям
    void set(int n,char s,String str) {
        //Заполнение полей
        num = n;
        symb = s;
        text = str;
    }


    public static void main(String[] args) {
        Class_one obj1 = new Class_one();
        Class_one obj2 = new Class_one();

        //Заполнение полей объектов
        obj1.set(10,'A',"Всем привет");
        obj2.set(200,'b',"Again- всем привет");

        //Отображение окон
        obj1.showText();
        obj2.showText();

    }
}


