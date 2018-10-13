package VASILYEV_SAMOUCHITEL_JAVA.math_functions;

/**
 * Created by Isanbet on 07.10.2018.
 */

public class row_fibonachi_3 {
    public static void main(String[] args) {
        numbers_fibo(10);
    }

    public static void numbers_fibo(int max_number){
        int fibo;

        for (int a=0; a<=max_number; a++){
            if (a==0 || a==1){
                System.out.println(a);
                System.out.println("********");
            } else {
                fibo = (a - 1) + (a - 2);
                System.out.println(fibo + " osn " + a);
                System.out.println("********");
            }
        }
    }
}

