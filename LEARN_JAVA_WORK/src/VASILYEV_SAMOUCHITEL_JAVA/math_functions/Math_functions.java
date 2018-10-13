package VASILYEV_SAMOUCHITEL_JAVA.math_functions;

public class Math_functions {

    //Самоучитель JAVA с примерами и программами
    public static void main(String[] args) {
        stepen();
        stepen2();
        stepen3();
    }

    public static void stepen(){
        int foundation = 2;
        int stepen = 5;
        int result = (int)Math.pow(foundation, stepen);
        //int resultInt = (int)result;
        System.out.println("Число " + foundation + " в степени " + stepen + " равно " + result);
    }

    public static void stepen2(){
        double foundation = 16;
        double stepen = (double)1/3;
        double result = Math.pow(foundation, stepen);
        //int resultInt = (int)result;
        System.out.println("Число " + foundation + " в степени " + stepen + " равно " + result);
    }

    public static void stepen3(){
        double foundation = 16;
        double stepen = (double)1/2;
        double result = Math.pow(foundation, stepen);
        //int resultInt = (int)result;
        System.out.println("Число " + foundation + " в степени " + stepen + " равно " + result);
    }


}


