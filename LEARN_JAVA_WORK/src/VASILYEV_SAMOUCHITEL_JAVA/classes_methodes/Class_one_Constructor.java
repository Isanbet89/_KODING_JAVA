package VASILYEV_SAMOUCHITEL_JAVA.classes_methodes;


import javax.swing.*;

//Самоучитель JAVA с примерами и программами
public class Class_one_Constructor {
    int num;
    char symb;
    String text;

    //Конструктор класса
    Class_one_Constructor(int n, char s, String str){
        set(n,s,str);
        showText();
    }

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
        //Заполнение полей и отображение их через конструктор
        Class_one_Constructor obj1 = new Class_one_Constructor(10,'A',"Всем привет");
        Class_one_Constructor obj2 = new Class_one_Constructor(200,'b',"Again- всем привет");
    }
}


