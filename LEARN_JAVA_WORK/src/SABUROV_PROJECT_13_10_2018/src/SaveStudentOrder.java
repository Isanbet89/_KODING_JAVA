package SABUROV_PROJECT_13_10_2018.src;

/**
 * Created by Isanbet on 13.10.2018.
 */

public class SaveStudentOrder {
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.hFirstName = "Алексей";
        so.hLastName = "Петров";
        so.wFirstName = "Галина";
        so.wLastName = "Петрова";

        StudentOrder so1 = new StudentOrder();
        so1.hFirstName = "Алексей";
        so1.hLastName = "Сидоров";
        so1.wFirstName = "Галина";
        so1.wLastName = "Сидорова";

        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder){
        long answer = 199;
        System.out.println("SaveStudentOrder 1 " + studentOrder.hLastName);

        return answer;
    }


}

