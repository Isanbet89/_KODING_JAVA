package VASILYEV_SAMOUCHITEL_JAVA.classes_methodes;


import javax.swing.*;

//Самоучитель JAVA с примерами и программами
public class Class_one_Reload_method {
    int num;
    char symb;
    String text;

    //*******************
    //Конструктор класса без аргументов
    Class_one_Reload_method(){
        set();
        showText();
    }

    //Присвоение значений полям для метода без аргументов
    void set() {
        //Заполнение полей (поля не заполняются)

    }
    //*******************
    //Конструктор класса с тремя аргументами
    Class_one_Reload_method(int n, char s, String str){
        set(n,s,str);
        showText();
    }

    //Присвоение значений полям для метода с тремя аргументами
    void set(int n,char s,String str) {
        //Заполнение полей
        num = n;
        symb = s;
        text = str;
    }

    //*******************
    //Перезагрузка метода с целочисленным аргументом
    Class_one_Reload_method(int n){
        //Заполнение полей
        set(n);
        //Отображение сообщения с информацией об объекте
        showText();
    }

    //Метод класса для отображения сообщения для метода с целочисленным аргументом
    void set(int n){
        //Заполнение полей
        num=n;
        symb='b';
        text="Целочисленный аргумент";
    }
    //*******************

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

    public static void main(String[] args) {
        //Заполнение полей и отображение их через конструктор
        Class_one_Reload_method obj1 = new Class_one_Reload_method();
        Class_one_Reload_method obj2 = new Class_one_Reload_method(2,'b',"Три аргумента");
        Class_one_Reload_method obj3 = new Class_one_Reload_method(2);
    }
}


