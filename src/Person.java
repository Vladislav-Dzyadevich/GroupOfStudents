import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private String surName;
    private String sex;
    private int age;

    public Person() {
        super();
    }

    public Person(String name, String surName, String sex, int age) {
        super();
        this.name = name;
        this.surName = surName;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", surName=" + surName + ", sex=" + sex + ", age=" + age + "]";
    }

}
