package Saburov_PROJECT.order;

public class StudentOrder {
    private String hFirstName;
    private String hSurName;
    private String wFirstName;
    private String wSurName;

    public String gethFirstName() {
        return hFirstName;
    }

    public String gethSurName() {
        return hSurName;
    }

    public String getwFirstName() {
        return wFirstName;
    }

    public String getwSurName() {
        return wSurName;
    }

    public void sethFirstName(String hFirstName) {
        this.hFirstName = hFirstName;
    }

    public void sethSurName(String hSurName) {
        this.hSurName = hSurName;
    }

    public void setwFirstName(String wFirstName) {
        this.wFirstName = wFirstName;
    }

    public void setwSurName(String wSurName) {
        this.wSurName = wSurName;
    }


}


