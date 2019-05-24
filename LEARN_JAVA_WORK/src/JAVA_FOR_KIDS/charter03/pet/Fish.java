package JAVA_FOR_KIDS.charter03.pet;

/**
 * Created by Isanbet on 15.05.2019.
 */

public class Fish extends pet {

    public String say(String aWord){
        String petResponse = "Рыба не говорят " + aWord;
        return petResponse;
    }

    void eat(){
        System.out.println("Рыба не говорит, что она голодна");
    }

    int currentDeep = 0;
    public String dive(int howDeep, int currentDeep){
        currentDeep = 100;
        currentDeep = currentDeep + howDeep;
        String deepResearch = "Погружение на глубину " + howDeep + ", глубина " + currentDeep;
        return deepResearch;
    }

}

