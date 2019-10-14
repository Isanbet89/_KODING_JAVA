package JAVA_FOR_KIDS._old._14052019.pet;

/**
 * Created by Isanbet on 06.02.2019.
 */

public class FishSay extends Pet {

    public String say(String something){
        return "Ты не в курсе, что рыбы не разговаривают?";
    }

    public static void main(String[] args) {
        FishSay myFishSay = new FishSay();

        String petReaction = myFishSay.say("Hello");
        System.out.println(petReaction);

    }


}

