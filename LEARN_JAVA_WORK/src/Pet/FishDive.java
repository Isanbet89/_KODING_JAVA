package Pet;

public class FishDive extends Pet{
    int currentDepth=0;
    public int dive(int howDeep){
        currentDepth=currentDepth+howDeep;
        System.out.println("Глубина " + howDeep + " километров");
        return currentDepth;
    }
}
