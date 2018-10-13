public class DogBark {
    int size;
    String name;

    void bark(){
        if (size>60){
            System.out.println("Gaf Gaf");
        } else if (size > 14){
            System.out.println("Wof Wof");
        } else{
            System.out.println("Tyaf Tyaf");
        }
    }
}
