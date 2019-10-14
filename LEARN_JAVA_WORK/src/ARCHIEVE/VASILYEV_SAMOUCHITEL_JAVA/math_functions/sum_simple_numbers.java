package VASILYEV_SAMOUCHITEL_JAVA.math_functions;

public class sum_simple_numbers {

    public static void check_number(int number) {

        for (int val_number = 2; val_number <= number; val_number++) {
            int sovp=0;
            for (int i = 2; i <= val_number; i++) {

                if (val_number % i == 0 && sovp<=1) {
                    sovp++;

                    if (sovp==2){
                        i=val_number;
                    }
                }

                if (i==val_number && sovp<=1){
                    System.out.println(val_number);
                }
            }
        }
    }

    public static void main(String[] args) {
        check_number(10000);
    }
}


