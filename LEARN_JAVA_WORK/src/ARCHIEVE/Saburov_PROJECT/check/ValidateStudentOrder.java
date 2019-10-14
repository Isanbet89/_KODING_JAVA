package Saburov_PROJECT.check;

import Saburov_PROJECT.SchedulerOrder;
import Saburov_PROJECT.SendMail;
import Saburov_PROJECT.check.CheckChildren;
import Saburov_PROJECT.check.CheckCityRegister;
import Saburov_PROJECT.check.CheckStudent;
import Saburov_PROJECT.check.CheckWedding;
import Saburov_PROJECT.order.ReadStudentOrder;
import Saburov_PROJECT.order.StudentOrder;

public class ValidateStudentOrder
{
    public static void main(String[] args) {
        checkAll();
    }

    public static void checkAll(){
        StudentOrder stOrder = new StudentOrder();

        ReadStudentOrder.readStudentOrder(stOrder);
        CheckCityRegister.checkCityRegister(stOrder);
        CheckWedding.checkWedding(stOrder);
        CheckChildren.checkChildren(stOrder);
        CheckStudent.checkStudent(stOrder);

        SchedulerOrder.schedulerOrder(stOrder);

        SendMail.sendMail(stOrder);


    }


}


