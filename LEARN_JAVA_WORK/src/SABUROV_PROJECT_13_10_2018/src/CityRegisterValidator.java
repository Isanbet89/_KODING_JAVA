package SABUROV_PROJECT_13_10_2018.src;

/**
 * Created by Isanbet on 14.10.2018.
 */

public class CityRegisterValidator {
    String hostName;
    String login;
    String password;

    AnswerCityRegister checkCityRegister(StudentOrder so){
        System.out.println("City Register is running " + hostName + ", "
                + login + ", " + password);
        AnswerCityRegister ans = new AnswerCityRegister();
        ans.success = false;
        return ans;
    }
}

