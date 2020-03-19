import java.io.BufferedWriter;
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
import java.util.List;

public class SaveStudentsInFile extends Group {
    public void saveGroup() throws IOException, ClassNotFoundException {
        Group groupStudents = new Group();
        List<Student> students = new ArrayList<>();
        students.addAll(groupStudents.getStudents());

        FileOutputStream f = new FileOutputStream(new File("Group.txt"));
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(students);
        o.close();
        f.close();
        FileInputStream fi = new FileInputStream(new File("Group.txt"));
        ObjectInputStream oi = new ObjectInputStream(fi);
        System.out.println(students);




        //Group pr1 = (Group) oi.readObject();
        //	System.out.println(pr1.toString());
    }

    @Override
    public String toString() {
        return "SaveStudentsInFile [toString()=" + super.toString() + "]";
    }
}
