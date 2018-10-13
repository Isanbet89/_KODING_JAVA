package Saburov_PROJECT.check;

import Saburov_PROJECT.order.StudentOrder;

public class CheckCityRegister {

    public static void main(String[] args) {

    }


    public static String connectServer(){
        String hostName = "123.168.0.1";
        return hostName;
    }

    public static StudentOrder checkCityRegister(StudentOrder stOrder){

        System.out.println("Проверяется реестр" + " " + stOrder.gethFirstName());
        System.out.println("Хостинг: " + connectServer());
        return stOrder;
    }
}


