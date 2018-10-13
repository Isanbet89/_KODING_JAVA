package Saburov_PROJECT.order;

public class ReadStudentOrder {
    public static StudentOrder readStudentOrder(StudentOrder stOrder){
        System.out.println("Заявка принята" + " " + stOrder.gethFirstName());

        return stOrder;
    }
}


