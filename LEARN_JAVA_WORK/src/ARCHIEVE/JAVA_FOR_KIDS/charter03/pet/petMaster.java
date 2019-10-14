package JAVA_FOR_KIDS.charter03.pet;

/**
 * Created by Isanbet on 15.05.2019.
 */

public class petMaster {
    public static void main(String[] args) {
        String petReaction;

        pet myPet = new pet();

        myPet.eat();

        myPet.sleep();

        petReaction = myPet.say("Чик Чирик!");
        System.out.println(petReaction);
    }
}

