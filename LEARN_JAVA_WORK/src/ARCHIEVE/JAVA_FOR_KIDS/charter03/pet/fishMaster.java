package JAVA_FOR_KIDS.charter03.pet;

/**
 * Created by Isanbet on 15.05.2019.
 */

public class fishMaster {
    public static void main(String[] args) {
        String petReaction;
        String deepResearch;

        Fish myFish = new Fish();

        myFish.eat();

        myFish.sleep();

        petReaction = myFish.say("Чик Чирик!");
        System.out.println(petReaction);

        deepResearch = myFish.dive(220, 100);
        System.out.println(deepResearch);
    }
}

