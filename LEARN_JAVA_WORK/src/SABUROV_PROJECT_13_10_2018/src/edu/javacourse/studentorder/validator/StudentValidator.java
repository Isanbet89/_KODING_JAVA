package SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.validator;

import SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.domain.AnswerStudent;
import SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.domain.StudentOrder;

/**
 * Created by Isanbet on 14.10.2018.
 */

public class StudentValidator {
    public AnswerStudent checkStudent(StudentOrder so){
        System.out.println("Студенты проверяются");
        return new AnswerStudent();
    }
}

