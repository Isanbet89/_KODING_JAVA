package VASILYEV_SAMOUCHITEL_JAVA.math_functions;

public class increments_decrements {
    public static void main(String[] args) {
        int x,y;

        x=1;
        y=x++; //x сначала присваивается переменной y, потом инкременируется
        System.out.println(y);

        x=1;
        y=++x; //x сначала инкременируется, потом присваивается переменной y
        System.out.println(y);

        x=1;
        y=x--; //x сначала присваивается переменной y, потом декременируется
        System.out.println(y);

        x=1;
        y=--x; //x сначала декременируется, потом присваивается переменной y
        System.out.println(y);
    }
}


