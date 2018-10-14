package SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.validator;

import SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.domain.AnswerCityRegister;
import SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.domain.StudentOrder;

/**
 * Created by Isanbet on 14.10.2018.
 */

public class CityRegisterValidator {
    public String hostName;
    protected int port;
    private String login;
    String password;

    public AnswerCityRegister checkCityRegister(StudentOrder so){
        System.out.println("City Register is running " + hostName + ", "
                + login + ", " + password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}

