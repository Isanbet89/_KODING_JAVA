package Pet;

public class FishDiveMaster {
    public static void main(String[] args) {
        FishDive myFishDive = new FishDive();
        int currentDive = myFishDive.dive(200);
        myFishDive.sleep();
    }
}
