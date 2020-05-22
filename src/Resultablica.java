import java.io.Serializable;

public class Resultablica implements Serializable  {
    private String id_person;
    private String name;
    private String surname;
    private int age;
    private String region;
    private String result;

    public Resultablica() {}

    public Resultablica(String id_person, String name, String surname, int age, String region, String result) {
        this.id_person = id_person;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.region = region;
        this.result = result;
    }

    public String getId_person() {
        return id_person;
    }

    public void setId_person(String id_person) {
        this.id_person = id_person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
       String s = "";
       s = id_person + ") " + " NAME:"+ name + " "+ " SURNAME:" + surname + " " +" AGE:" + age +" "+ " REGION:" + region;
       return s;
    }
}
