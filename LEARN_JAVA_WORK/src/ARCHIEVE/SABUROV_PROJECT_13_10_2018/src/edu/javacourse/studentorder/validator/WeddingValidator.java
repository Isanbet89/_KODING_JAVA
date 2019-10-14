package SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.validator;

import SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.domain.AnswerWedding;
import SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.domain.StudentOrder;

/**
 * Created by Isanbet on 14.10.2018.
 */

public class WeddingValidator {
    public AnswerWedding checkWedding(StudentOrder so){
        System.out.println("Check wedding запущен");
        return new AnswerWedding();
    }
}

