import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        Group group = new Group();

        Student studentForDelete = new Student("Igor", "Kyhar", "Man", 10, "Computer sience", 12348); // тут хранятся
        // студенты для
        // удаления

        try {
            group.addStudent(new Student("Aleksandr", "Kyk", "Man", 10, "Computer sience", 12346));
            group.addStudent(new Student("Roma", "Adamenko", "Man", 10, "Computer sience", 12347));
            group.addStudent(new Student("Igor", "Kyhar", "Man", 10, "Computer sience", 12348));
            group.addStudent(new Student("Artem", "Kravchenko", "Man", 10, "Computer sience", 12349));
            group.addStudent(new Student("Slava", "Ivin", "Man", 10, "Computer sience", 12350));
            group.addStudent(new Student("Sasha", "Ponochovna", "Man", 1000, "Computer sience", 12351));
            group.addStudent(new Student("Ira", "Molochko", "Man", 10, "Computer sience", 12352));
            group.addStudent(new Student("Ania", "Litvinova", "Man", 10, "Computer sience", 12353));
            group.addStudent(new Student("Vlad", "Dzyadevich", "Man", 10, "Computer sience", 12354));

        } catch (MyException e) {
            e.getMessage();
        }
        List<Student> list = new ArrayList<>();
        list.addAll(group.getStudents());

        try {

            FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            for (int i = 0; i < list.size(); i++) {
                o.writeObject(list.get(i));
            }
            o.close();
            f.close();

            FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            Student pr1 = (Student) oi.readObject();
            Student pr2 = (Student) oi.readObject();
            Student pr3 = (Student) oi.readObject();
            Student pr4 = (Student) oi.readObject();
            Student pr5 = (Student) oi.readObject();
            Student pr6 = (Student) oi.readObject();
            Student pr7 = (Student) oi.readObject();
            Student pr8 = (Student) oi.readObject();
            Student pr9 = (Student) oi.readObject();

            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        group.deleteStudent(studentForDelete); // удаление студента из группы.

        System.out.println("Студенты в группе");
        System.out.println(group);
        System.out.println();

        System.out.println("Поиск студента по фамилии");
        group.searchByName("Dzyadevich");

        System.out.println();

        try {
            group.interactiveAdd(new Student());
            // интерактивное добавление студента в группу.
        } catch (MyException e) {

            e.getMessage();
        }

        Collections.sort(group.getStudents(), new LastNameComparator());
        Collections.sort(group.getStudents(), new RecordComparator());

        System.out.println("Группа после всех изменений");
        System.out.println(group);
        System.out.println();

        System.out.println("Студенты пригодные к службе");

        DraftBoard zxc = new DraftBoardStudent();
        List<Student> adultStudents = zxc.studentsForArmy(group.getStudents());
        System.out.println(adultStudents);

    }

}
