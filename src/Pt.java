import java.io.Serializable;

public class Pt implements Serializable {
    private String id_user;
    private int pullups;
    private int hundredmeterrun;
    private int threekilometerrun;

    public Pt() {}

    public Pt(String id_user, int pullups, int hundredmeterrun, int threekilometerrun) {
        this.id_user = id_user;
        this.pullups = pullups;
        this.hundredmeterrun = hundredmeterrun;
        this.threekilometerrun = threekilometerrun;
    }

    public int getPullups() {
        return pullups;
    }

    public void setPullups(int pullups) {
        this.pullups = pullups;
    }

    public int getHundredmeterrun() {
        return hundredmeterrun;
    }

    public void setHundredmeterrun(int hundredmeterrun) {
        this.hundredmeterrun = hundredmeterrun;
    }

    public int getThreekilometerrun() {
        return threekilometerrun;
    }

    public void setThreekilometerrun(int threekilometerrun) {
        this.threekilometerrun = threekilometerrun;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }
}
