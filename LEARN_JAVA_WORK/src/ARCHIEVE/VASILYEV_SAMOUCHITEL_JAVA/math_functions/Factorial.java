package VASILYEV_SAMOUCHITEL_JAVA.math_functions;

public class Factorial {
    public static  void CalcFactorial(int a){
        int i,fact;
        fact=1;

        for (i=1; i<a; i++){
            fact = (i+1)*fact;

        }

        System.out.println(fact);

    }

    public static void main(String[] args) {
        CalcFactorial(5);
    }
}




