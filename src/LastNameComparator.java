import java.util.Comparator;

public class LastNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1 != null && o2 == null) {
            return 1;
        }
        if (o1 == null && o2 != null) {
            return -1;
        }
        if (o1 == null && o2 == null) {
            return 0;
        }
        Student st1 = (Student) o1;
        Student st2 = (Student) o2;
        if (st1.getSurName().compareTo(st2.getSurName()) > 0) {
            return 1;
        }
        if (st1.getSurName().compareTo(st2.getSurName()) < 0) {
            return -1;
        }
        return 0;
    }

}
