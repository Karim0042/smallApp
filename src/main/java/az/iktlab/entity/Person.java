package az.iktlab.entity;

public class Person {
    private Integer id;
    private String name;
    private String surname;
    private String fatherName;
    private int age;
    private String gender;

    public Person() {
    }

    public Person( String name, String surname, String fatherName, int age,String gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.age = age;
        this.gender =gender;
    }

    public Person(Integer id, String name, String surname, String fatherName, int age, String gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fatherName = fatherName;
        this.age = age;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
