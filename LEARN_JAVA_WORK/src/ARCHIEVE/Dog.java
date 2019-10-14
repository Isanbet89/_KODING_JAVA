public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        //Создаем массив
        Dog[] myDogs = new Dog[3];
        //Помещаем элементы
        myDogs[0]=new Dog();
        myDogs[1]=new Dog();
        myDogs[2]=dog1;

        //Получаем доступ к объектам с помощью ссылок из массива
        myDogs[0].name="Fred";
        myDogs[1].name="George";

        //Вывод текста
        myDogs[2].bark();
        System.out.println("Последний элемент "+myDogs[2].name);

        //Перебираем элементы массива, вызываем bark()
        int x = 0;
        while (x<myDogs.length){
            myDogs[x].bark();
            x=x+1;
        }


    }

    public void bark() {
        System.out.println(name + " say gaff");
    }
}
