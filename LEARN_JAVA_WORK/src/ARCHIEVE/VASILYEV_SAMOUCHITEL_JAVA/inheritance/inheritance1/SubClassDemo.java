package VASILYEV_SAMOUCHITEL_JAVA.inheritance.inheritance1;

public class SubClassDemo {
    //Главный метод программы
    public static void main(String[] args) {
        //Создание объекта подкласса
        SubClass obj = new SubClass();

        //Присваивание полям объекта значений
        obj.setAll(100,"Текст", 'A');

        //Отображение значений полей
        obj.show();

        //Изменение значений полей объекта
        obj.setNumber(100);
        obj.name="Новый";

        //Отображение значений полей
        obj.show();
    }
}


