package SABUROV_PROJECT_13_10_2018.src;

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

            System.out.println("Start");
            if (so == null){
                break;
            }
            System.out.println("Finish");

            AnswerCityRegister cityAnswer = checkCityRegister(so);
            if (!cityAnswer.success){
                continue;
            }

            AnswerWedding wedAnswer = checkWedding(so);
            AnswerChildren childrenAnswer = checkChildren(so);
            AnswerStudent studentAnswer = checkStudent(so);

            sendMail(so);
        }
        System.out.println("Finish2");
    }

    static StudentOrder readStudentOrder(){
        StudentOrder so = new StudentOrder(); //Любой текст как комментарий
        return so;
    }

    static AnswerCityRegister checkCityRegister(StudentOrder so){
        System.out.println("City Register is running");
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
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
        System.out.println("Почта отправлена");
    }

}

