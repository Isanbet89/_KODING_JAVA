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
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll(){

        while(true) {
            StudentOrder so = readStudentOrder();

            if (so == null){
                break;
            }

            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.success){
                //
                //continue;
                break;
            }

            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childrenAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);
        }
    }

    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder(); //Любой текст как комментарий
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so){
        CityRegisterValidator crv1 = new CityRegisterValidator();
        crv1.hostName = "Host1";
        AnswerCityRegister ans1 = crv1.checkCityRegister(so);
        return ans1;
    }

    static AnswerWedding checkWedding(StudentOrder so){
        WeddingValidator wd = new WeddingValidator();
        return wd.checkWedding(so);
    }

    static AnswerChildren checkChildren(StudentOrder so){
        ChildrenValidator cv = new ChildrenValidator();
        return cv.checkChildren(so);
    }

    static AnswerStudent checkStudent(StudentOrder so){
        return new StudentValidator().checkStudent(so);
    }

    static void sendMail(StudentOrder so){
        new MailSender().sendMail(so);
    }

}

