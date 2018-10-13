package VASILYEV_SAMOUCHITEL_JAVA.inheritance.redefinition_method;

import java.awt.*;

public class SuperClass {
    /* static */ String text = "Некоторый текст";

    static void varText(String text){

        String strText = text;

        System.out.println(strText);
    }

/*    static void varText1(){

        String strText = text;

        System.out.println(strText);
    }

    public static void main(String[] args) {
        //varText1();
    }*/

}


