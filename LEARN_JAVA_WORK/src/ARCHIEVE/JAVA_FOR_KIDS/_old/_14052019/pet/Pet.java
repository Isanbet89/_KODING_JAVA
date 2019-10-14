package JAVA_FOR_KIDS._old._14052019.pet;

/**
 * Created by Isanbet on 05.02.2019.
 */

public class Pet {
    int age;
    float weight;
    float height;
    String color;

    public void sleep(){
        System.out.println("Спокойной ночи");
    }

    public void eat(){
        System.out.println("Я очень голоден");
    }

    public String say(String aWord){
        String petResponse = "Ну и ладно " + aWord;
        return petResponse;
    }

    public static void main(String[] args) {
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("Чик чирик");
        System.out.println(petReaction);
        myPet.sleep();
    }
}

