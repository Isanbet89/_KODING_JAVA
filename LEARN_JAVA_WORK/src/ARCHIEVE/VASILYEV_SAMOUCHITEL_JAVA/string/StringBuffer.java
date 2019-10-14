package VASILYEV_SAMOUCHITEL_JAVA.string;

import java.lang.*;

public class StringBuffer {

    public static void workText() {
        String str = "Слово";
        StringBuilder strVar = new StringBuilder(str);
        System.out.println(strVar.deleteCharAt(4));
        //StringBuffer strVar = new StringBuffer(str);
        //System.out.println(strVar.deleteCharAt(str,4));
    }

    public static void main(String[] args) {
        workText();
    }
}

//StringBuffer str3 = new StringBuffer(str);
//System.out.println(str3.deleteCharAt(4));