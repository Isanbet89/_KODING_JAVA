package Saburov.old;

public class StudentOrderInput {

    public static void main(String[] args) {
        OrderImput();
    }

    public static void OrderImput(){
        String hFirstName;
        String hSurName;
        String hPatroName;

        StudentOrder studentOrderImput = new StudentOrder();
        studentOrderImput.sethFirstName("Иванов");
        studentOrderImput.sethSurName("Иван");
        studentOrderImput.sethPatroName("Иванович");

        hFirstName=studentOrderImput.gethFirstName();
        hSurName=studentOrderImput.gethSurName();
        hPatroName=studentOrderImput.gethPatroName();

        System.out.println(": "+hFirstName+" "+hSurName+" "+hPatroName);
        //return hFirstName;
    }




}


