import java.io.Serializable;

public class Person implements Serializable {
    private Long id;
    private String name;
    private String surname;
    private String age;
    private String region;

    public Person(Object o, String name, String surname, String age, String region) {}
    public Person() {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.region = region;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAge() { return age; }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}