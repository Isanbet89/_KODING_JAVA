package Saburov_PROJECT.check;

import Saburov_PROJECT.order.StudentOrder;

public class CheckChildren {

    public static void main(String[] args) {
        StudentOrder studentOrder = new StudentOrder();

        checkChildren(studentOrder);
    }

    public static void checkChildren(StudentOrder stOrder){
        System.out.println("Проверяются дети" + " " + stOrder.gethFirstName());
    }
}


