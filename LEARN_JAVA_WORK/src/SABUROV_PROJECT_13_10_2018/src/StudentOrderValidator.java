package SABUROV_PROJECT_13_10_2018.src;

/**
 * Created by Isanbet on 13.10.2018.
 */

public class StudentOrderValidator {
    public static void main(String[] args) {
        checkAll();
    }

    static void checkAll(){
        StudentOrder so = readStudentOrder();

        AnswerCityRegister cityAnswer = checkCityRegister(so);
        AnswerWedding wedAnswer = checkWedding(so);
        AnswerChildren childrenAnswer = checkChildren(so);
        AnswerStudent studentAnswer = checkStudent(so);

        sendMail(so);
    }

    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder(); //Любой текст как комментарий
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so){
        System.out.println("City Register is runnig");
        AnswerCityRegister ans = new AnswerCityRegister();
        return ans;
    }

    static AnswerWedding checkWedding(StudentOrder so){
        System.out.println("Check wedding запущен");
        return new AnswerWedding();
    }

    static AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Check children запущен");
        return new AnswerChildren();
    }

    static AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Студенты проверяются");
        return new AnswerStudent();
    }

    static void sendMail(StudentOrder so){

    }

}

