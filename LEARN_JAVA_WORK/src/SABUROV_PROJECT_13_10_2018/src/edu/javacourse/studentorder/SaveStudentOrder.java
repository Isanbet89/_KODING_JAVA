package SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder;

import SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.domain.StudentOrder;
import SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.domain.other.Adult;


/**
 * Created by Isanbet on 13.10.2018.
 */

public class SaveStudentOrder {
    public static void main(String[] args) {
        buildStudentOrder();
        /*
        StudentOrder so = new StudentOrder();
        long ans = saveStudentOrder(so);
        System.out.println(ans);
        */
    }

    static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
        System.out.println("SaveStudentOrder");

        return answer;
    }

    static StudentOrder buildStudentOrder(){
        StudentOrder so = new StudentOrder();
        Adult husband = new Adult();
        husband.setGivenName("Андрей");
        husband.setSurName("Петров");
        husband.setPassportNumber("123456");
        so.setHusband(husband);

        String ans = husband.getPersonString();
        System.out.println(ans);

        return so;
    }
}
