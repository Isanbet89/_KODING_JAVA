package Pet;

public class Pet {
    int age;
    float weight;
    float height;
    String color;

    public void sleep(){
        System.out.println("Сон");
    }

    public void eat(){
        System.out.println("Еда");
    }

    public String say(String aWord){
        String petResponse = aWord;
        return petResponse;
    }
}
