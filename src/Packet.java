import java.io.Serializable;
import java.util.ArrayList;

public class Packet implements Serializable {
    private Serializable data;
    private String code;
    private ArrayList<Person>persons;
    private ArrayList<Med>medd;
    private Resultablica restab;
    private ArrayList<Resultablica> restabb;
    private Med med;
    private Pt pt;
    private Person person;

    public Packet() {
    }

    public Packet(Med med, Pt pt, Person person, String code) {
        this.med = med;
        this.pt = pt;
        this.person = person;
        this.code = code;
    }

    public Packet(String code, Person person) {
        this.code = code;
        this.person = person;
    }

    public Packet( ArrayList<Resultablica> restabb) {
        this.restabb = restabb;
    }

    public Packet(Serializable data, String code, ArrayList<Person> persons, ArrayList<Med> medd, Resultablica restab, ArrayList<Resultablica> restabb, Med med, Pt pt, Person person) {
        this.data = data;
        this.code = code;
        this.persons = persons;
        this.medd = medd;
        this.restab = restab;
        this.restabb = restabb;
        this.med = med;
        this.pt = pt;
        this.person = person;
    }

    public Packet(String code) {
        this.code = code;
    }
    public Serializable getData() {
        return data;
    }

    public void setData(Serializable data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public ArrayList<Med> getMedd() {
        return medd;
    }

    public void setMedd(ArrayList<Med> medd) {
        this.medd = medd;
    }

    public Med getMed() {
        return med;
    }

    public void setMed(Med med) {
        this.med = med;
    }

    public Pt getPt() {
        return pt;
    }

    public void setPt(Pt pt) {
        this.pt = pt;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Resultablica getRestab() {
        return restab;
    }

    public void setRestab(Resultablica restab) {
        this.restab = restab;
    }

    public ArrayList<Resultablica> getRestabb() {
        return restabb;
    }

    public void setRestabb(ArrayList<Resultablica> restabb) {
        this.restabb = restabb;
    }
}
