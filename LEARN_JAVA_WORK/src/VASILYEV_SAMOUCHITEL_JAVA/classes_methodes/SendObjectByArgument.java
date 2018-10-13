package VASILYEV_SAMOUCHITEL_JAVA.classes_methodes;

public class SendObjectByArgument {
    //Поля класса
    int number;
    char symb;

    //Конструктор класса
    SendObjectByArgument(int number, char symb){
        //для различения полей и аргументов используем this
        this.number = number;
        this.symb = symb;
    }

    //Метод для отображения значений полей объекта
    void show(){
        System.out.println("Поле объекта: " + number + " и " + symb);
    }

    static void MakeChange(SendObjectByArgument obj){
        obj.number++;
        obj.symb++;

        //Текст для отображения
        String text = "Аргумент-объект: поля " + obj.number + " " + obj.symb;

        //Вывод сообщения на консоль
        System.out.println(text);
    }

    //Перегруженный статический метод
    //Аргументы - переменные базовых типов
    static void MakeChange(int number, char symb){
        //Изменение аргументов метода
        number++;
        symb++;

        //Текст для отображения
        String text = "Аргументы базовых типов: значения " + number + " и " + symb;

        //Вывод сообщения на консоль
        System.out.println(text);
    }

    public static void main(String[] args) {
        //Создание объекта
        SendObjectByArgument obj = new SendObjectByArgument(1, 'a');

        //Значение полей объекта
        obj.show();

        //Изменение объекта
        MakeChange(obj);

        //Значение полей объекта
        obj.show();

        //Изменение полей объекта
        MakeChange(obj.number, obj.symb);

        //Значение полей объекта
        obj.show();

    }

}


