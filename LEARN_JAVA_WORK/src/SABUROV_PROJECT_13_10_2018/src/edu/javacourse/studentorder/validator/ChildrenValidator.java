package SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.validator;

import SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.domain.AnswerChildren;
import SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.domain.StudentOrder;

/**
 * Created by Isanbet on 14.10.2018.
 */

public class ChildrenValidator {
    public AnswerChildren checkChildren(StudentOrder so){
        System.out.println("Check children запущен");
        return new AnswerChildren();
    }
}

