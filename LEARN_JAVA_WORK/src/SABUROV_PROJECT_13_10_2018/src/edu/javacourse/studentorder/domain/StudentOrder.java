package SABUROV_PROJECT_13_10_2018.src.edu.javacourse.studentorder.domain;

/**
 * Created by Isanbet on 14.10.2018.
 */

public class StudentOrder {
    private long studentOrderId;
    private Adult husband;
    private Adult wife;

    public long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    private Child child;

}

