import java.io.Serializable;

public class Student extends Person implements Serializable{


    private String faculty;
    private int record;

    public Student() {
        super();
    }

    public Student(String name, String surName, String sex, int age, String faculty, int record) {
        super(name, surName, sex, age);
        this.faculty = faculty;
        this.record = record;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getRecord() {
        return record;
    }

    public void setRecord(int record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "Student [name = " + super.getName() + ", surName = " + super.getSurName() + ", sex = " + super.getSex()
                + ", age = " + super.getAge() + ", faculty = " + getFaculty() + ", record = " + record + "]";
    }

}
