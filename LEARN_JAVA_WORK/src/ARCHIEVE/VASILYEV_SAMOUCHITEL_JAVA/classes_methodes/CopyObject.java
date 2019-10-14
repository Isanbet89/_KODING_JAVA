package VASILYEV_SAMOUCHITEL_JAVA.classes_methodes;

public class CopyObject {

    //Текстовое поле класса:
    String name;

    //Числовое поле класса
    int number;

    //Конструктор класса (два аргумента):
    CopyObject(String str, int num){
            name = str;
            number = num;
    }

    //Конструктор создания копии
    CopyObject(CopyObject obj){
        name = obj.name;
        number = obj.number;
    }

    //Метод для создания копии объекта
    CopyObject copy(){
        //Создание объекта-копии
        CopyObject tmp = new CopyObject(name,number);
        //Возвращение результата
        return tmp;
    }

    //Метод для вывода информации об объекте
    void show(){
        String text = "Поле объекта \n";
        text += "name: " + name + "\n number: " + number;
        //Вывод на консоль
        System.out.println(text);
    }

    public static void main(String[] args) {
        CopyObject objA = new CopyObject("Первый объект", 100);
        CopyObject objB = new CopyObject(objA);

        //Отображение информации об объектах
        objA.show();
        objB.show();

        //Изменение второго объекта
        objB.name="Второй объект";
        objB.number=200;

        //Отображение информации об объектах
        objA.show();
        objB.show();

        //"Копирование" объектов
        objA = objB.copy();

        //Отображение информации об объекте
        objA.show();

        //Изменение второго объекта
        objB.name="Второй объект изменён";
        objB.number=300;

        //Отображение информации об объектах
        objA.show();
        objB.show();

    }
}


