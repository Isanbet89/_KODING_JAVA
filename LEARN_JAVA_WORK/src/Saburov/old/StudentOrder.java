package Saburov.old;

public class StudentOrder {
    private String hFirstName;
    private String hSurName;
    private String hPatroName;
    private String wFirstName;
    private String wSurName;
    private String wPatroName;

    public String gethFirstName(){
        return hFirstName;
    }

    public String gethSurName(){
        return hSurName;
    }

    public String gethPatroName(){
        return hPatroName;
    }

    public void sethFirstName(String hFirstName) {
        this.hFirstName = hFirstName;
    }

    public void sethSurName(String hSurName) {
        this.hSurName = hSurName;
    }

    public void sethPatroName(String hPatroName) {
        this.hPatroName = hPatroName;
    }
}


