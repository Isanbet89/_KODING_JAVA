package JAVA_FOR_KIDS.charter03.pet;

/**
 * Created by Isanbet on 15.05.2019.
 */

public class pet {
    int age;
    float weight;
    float height;
    String color;

    void sleep(){
        System.out.println("Спокойной ночи");
    }

    void eat(){
        System.out.println("Я очень голоден!");
    }

    public  String say(String aWord){
        String petResponse = "Ну и ладно! " + aWord;
        return petResponse;
    }
}

