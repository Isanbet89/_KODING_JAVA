package SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.domain;

/**
 * Created by Isanbet on 14.10.2018.
 */

public class StudentOrder {
    private String hFirstName;
    private String hLastName;
    private String wFirstName;
    private String wLastName;

    public String gethFirstName() {
        return hFirstName;
    }

    public void sethFirstName(String hFirstName) {
        this.hFirstName = hFirstName;
    }

    public String gethLastName() {
        return hLastName;
    }

    public void sethLastName(String hLastName) {
        this.hLastName = hLastName;
    }

    public String getwFirstName() {
        return wFirstName;
    }

    public void setwFirstName(String wFirstName) {
        this.wFirstName = wFirstName;
    }

    public String getwLastName() {
        return wLastName;
    }

    public void setwLastName(String wLastName) {
        this.wLastName = wLastName;
    }
}

