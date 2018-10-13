package VASILYEV_SAMOUCHITEL_JAVA.static_nethods.example2;

public class IncriemField {
    private static int Count = 100;
    public static void ShowCount(){
        System.out.println(Count);
    }

    public static void main(String[] args) {
        ShowCount();
    }
}


