package VASILYEV_SAMOUCHITEL_JAVA.inheritance.inheritance1;

public class SubClass extends SuperClass {
    //Поле подкласса
    char symbol;

    //Метод подкласса
    void setAll(int n, String txt, char s){
        //Вызов метода, описанного в суперклассе
        setNumber(n);

        //Обращение к полю, описанному в суперклассе
        name = txt;

        //Присвоение значения полю подкласса
        symbol = s;
    }

    void show(){
        //Отображение значений полей подкласса
        System.out.println("Числовое поле: " + number);
        System.out.println("Текстовое поле: " + name);
        System.out.println("Символьное поле: " + symbol);
    }

}


