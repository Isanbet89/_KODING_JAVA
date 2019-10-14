package VASILYEV_SAMOUCHITEL_JAVA.classes_methodes;

import javax.swing.*;

public class AssignmentObject {
    //Текстовое поле класса
    String text;

    //Конструктор класса без аргументов
    AssignmentObject() {
        text = "Новый объект";
    }

    //Конструктор класса (с одним аргументом)
    AssignmentObject(String str){
        text = str;
    }

    //Метод для отображения текста
    void show(){
        JOptionPane.showMessageDialog(null,text);
    }

    public static void main(String[] args) {
        //Создание объектов
        AssignmentObject objA = new AssignmentObject();
        AssignmentObject objB = new AssignmentObject("Второй объект");

        //Отображение текстовых полей объектов
        objA.show();
        objB.show();

        //Присвоение объектов
        objA = objB;

        //Текстовое поле первого объекта
        objA.show();

        //Изменение поля второго объекта
        objB.text="Изменён второй объект";

        //Текстовое поле первого объекта
        objA.show();


    }
}


