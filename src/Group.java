import java.util.List;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Group implements Serializable {
    private int groupCapacity = 10;

    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) throws MyException {

        if (students.size() < groupCapacity) {
            students.add(student);
        } else {
            throw new MyException();

        }

    }

    public void deleteStudent(Student student) {
        for (Student st : students) {
            if (st.getName() != null && st.getName().equals(student.getName()) && st.getSurName() != null
                    && st.getSurName().equals(student.getSurName()) && st.getSex() != null
                    && st.getSex().equals(student.getSex()) && st.getFaculty() != null
                    && st.getFaculty().equals(student.getFaculty()) && st.getAge() != 0
                    && st.getAge() == student.getAge() && st.getRecord() != 0
                    && st.getRecord() == student.getRecord()) {
                students.remove(st);
                return;
            }
        }

    }

    public void searchByName(String surName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) != null && students.get(i).getSurName().equals(surName)) {
                System.out.println(students.get(i));
                return;
            }
        }

    }

    public void interactiveAdd(Student student) throws MyException {
        Scanner scn = new Scanner(System.in);
        System.out.println("Интерактивное добавление студента в группу");
        System.out.println("Введите имя");
        student.setName(scn.nextLine());
        System.out.println("Введите фамилию");
        student.setSurName(scn.nextLine());
        System.out.println("Введите пол");
        student.setSex(scn.nextLine());
        System.out.println("Введите факультет");
        student.setFaculty(scn.nextLine());
        System.out.println("Введите возраст");
        student.setAge(scn.nextInt());
        System.out.println("Введите номер зачетки");
        student.setRecord(scn.nextInt());
        scn.close();
        if (students.size() < groupCapacity) {
            students.add(0, student);
        } else {
            throw new MyException();
        }

    }


    @Override
    public String toString() {
        return "Group [students=" + students + "]";
    }

}