import java.io.Serializable;

public class Med implements Serializable {
    private String id_person;
    private String policlinic;
    private double weight;
    private int height;
    private double vision;
    private String scoliosis;
    private String flatfeet;
    private double pulse;
    private String wereregisteredwithadoctor;
    private String mentalhospital;

    public Med() {
    }

    public Med(String id_person, String policlinic, double weight, int height, double vision, String scoliosis, String flatfeet,
               double pulse, String wereregisteredwithadoctor, String mentalhospital) {
        this.id_person = id_person;
        this.policlinic = policlinic;
        this.weight = weight;
        this.height = height;
        this.vision = vision;
        this.scoliosis = scoliosis;
        this.flatfeet = flatfeet;
        this.pulse = pulse;
        this.wereregisteredwithadoctor = wereregisteredwithadoctor;
        this.mentalhospital = mentalhospital;
    }

    public String getId_person() {
        return id_person;
    }

    public void setId_person(String id_person) {
        this.id_person = id_person;
    }

    public String getPoliclinic() {
        return policlinic;
    }

    public void setPoliclinic(String policlinic) {
        this.policlinic = policlinic;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVision() {
        return vision;
    }

    public void setVision(double vision) {
        this.vision = vision;
    }

    public String getScoliosis() {
        return scoliosis;
    }

    public void setScoliosis(String scoliosis) {
        this.scoliosis = scoliosis;
    }

    public String getFlatfeet() {
        return flatfeet;
    }

    public void setFlatfeet(String flatfeet) {
        this.flatfeet = flatfeet;
    }

    public double getPulse() {
        return pulse;
    }

    public void setPulse(double pulse) {
        this.pulse = pulse;
    }

    public String getWereregisteredwithadoctor() {
        return wereregisteredwithadoctor;
    }

    public void setWereregisteredwithadoctor(String wereregisteredwithadoctor) {
        this.wereregisteredwithadoctor = wereregisteredwithadoctor;
    }

    public String getMentalhospital() {
        return mentalhospital;
    }

    public void setMentalhospital(String mentalhospital) {
        this.mentalhospital = mentalhospital;
    }

}