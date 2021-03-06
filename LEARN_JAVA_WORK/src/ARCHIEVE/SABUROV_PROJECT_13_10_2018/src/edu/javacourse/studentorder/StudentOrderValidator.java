package SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder;

import SABUROV_PROJECT_13_10_2018.src.edu.javacourse.mail.MailSender;
import SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.domain.*;
import SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.validator.ChildrenValidator;
import SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.validator.CityRegisterValidator;
import SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.validator.StudentValidator;
import SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.validator.WeddingValidator;

/**
 * Created by Isanbet on 13.10.2018.
 */

public class StudentOrderValidator {

    private CityRegisterValidator cityRegisterVal;
    private WeddingValidator weddingVal;
    private ChildrenValidator childrenVal;
    private StudentValidator studentVal;
    private MailSender mailSender;

    public StudentOrderValidator(){
        cityRegisterVal = new CityRegisterValidator();
        weddingVal = new WeddingValidator();
        childrenVal = new ChildrenValidator();
        studentVal = new StudentValidator();
        mailSender = new MailSender();
    }

    public static void main(String[] args) {
        StudentOrderValidator sov = new StudentOrderValidator();
        sov.checkAll();
    }

    public void checkAll(){
        StudentOrder[] soArray = readStudentOrders();
//        for(int c = 0; c < soArray.length; c++){
//            System.out.println(" ");
//            checkOneOrder(soArray[c]);
//        }

        for (StudentOrder so : soArray){
            System.out.println(" ");
            checkOneOrder(so);
        }
    }

    public StudentOrder[] readStudentOrders(){
        StudentOrder[] soArray = new StudentOrder[3];

        for(int c = 0; c < soArray.length; c++){
            soArray[c] = SaveStudentOrder.buildStudentOrder(c);
        }

        return soArray;
    }

    public void checkOneOrder(StudentOrder so) {
        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWedding wedAnswer = checkWedding(so);
        AnswerChildren childrenAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);

        sendMail(so);
    }

    public AnswerCityRegister checkCityRegister(StudentOrder so){
        return cityRegisterVal.checkCityRegister(so);
    }

    public AnswerWedding checkWedding(StudentOrder so){
        return weddingVal.checkWedding(so);
    }

    public AnswerChildren checkChildren(StudentOrder so){
        return childrenVal.checkChildren(so);
    }

    public AnswerStudent checkStudent(StudentOrder so){
        return studentVal.checkStudent(so);
    }

    public void sendMail(StudentOrder so){
        mailSender.sendMail(so);
    }

}

