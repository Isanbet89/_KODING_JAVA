package JAVA_FOR_KIDS._old._14052019.pet;

/**
 * Created by Isanbet on 05.02.2019.
 */

public class Fish extends Pet {

//    public static void main(String[] args) {
//        Fish myLittleFish = new Fish();
//        myLittleFish.sleep();
//    }

    int currentDepth = 0;

    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        System.out.println("Ныряю на глубину " + howDeep + " футов");
        System.out.println("Я на глубине " + currentDepth
                + " футов ниже уровня моря");
        return currentDepth;
    }

    public static void main(String[] args) {
        Fish myFish = new Fish();
        myFish.dive(2);
        myFish.dive(3);
        myFish.sleep();

        String petReaction = myFish.say("Ха");
        System.out.println(petReaction);
    }

}
