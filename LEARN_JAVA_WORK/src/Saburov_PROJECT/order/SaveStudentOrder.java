package Saburov_PROJECT.order;

public class SaveStudentOrder
{
    public static void main(String[] args) {
        runAll();
    }

    public static void runAll(){
        StudentOrder stOrder = new StudentOrder();
        stOrder.sethFirstName("Иван");
        stOrder.sethSurName("Иванов");
        stOrder.setwFirstName("Мария");
        stOrder.setwSurName("Иванова");

        long ans = saveOrder(stOrder);
    }


    public static long saveOrder(StudentOrder stOrder){
        long answer;
        answer = 200;
        System.out.println("Answer: " + answer + " " + stOrder.gethFirstName());

        return answer;
    }


}


