package VASILYEV_SAMOUCHITEL_JAVA.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

    public static void main(String[] args) {
        String input = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern = Pattern.compile("Java(\\w*)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group());
        }


        //Pattern pattern = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
        String input2 = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern2 = Pattern.compile("[A-Za-z]");
        Matcher matcher2 = pattern2.matcher(input2);

        while (matcher2.find()){
            System.out.println(matcher2.group());
        }
    }




}


