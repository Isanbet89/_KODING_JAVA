package VASILYEV_SAMOUCHITEL_JAVA.math_functions;

/**
 * Created by Isanbet on 07.10.2018.
 */

public class row_fibonachi {
    public static void main(String[] args) {
        numbers_fibo(10);
    }

    public static void numbers_fibo(int max_number){
        int a1=0,a2=1,a3;

        for (int a=0; a<=max_number; a++){
            a3=a1+a2;
            System.out.println(a3);
            a1=a2;
            a2=a3;
        }
    }
}

