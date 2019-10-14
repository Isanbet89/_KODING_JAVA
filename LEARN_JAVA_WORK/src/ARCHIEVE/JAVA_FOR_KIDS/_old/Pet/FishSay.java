package JAVA_FOR_KIDS._old.Pet;

public class FishSay extends Pet {

    public static void main(String[] args) {
        String petReaction;

        FishSay myLittleFish = new FishSay();
        petReaction = myLittleFish.say("Рыбы молчат!");
        System.out.println(petReaction);

    }



}
