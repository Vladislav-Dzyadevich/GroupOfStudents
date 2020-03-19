import java.util.Comparator;

public class RecordComparator implements Comparator{

    public int compare(Object o1, Object o2) {
        if(o1 != null && o2 == null) {
            return 1;
        }
        if(o1 == null && o2 != null) {
            return -1;
        }
        if(o1 == null && o2 == null) {
            return 0;
        }
        Student st1 = (Student) o1;
        Student st2 = (Student) o2;

        if(st1. getRecord()  >  st2.getRecord()) {
            return 1;
        }
        if(st1.getRecord() < st2.getRecord()) {
            return -1;
        }
        return 0;
    }

}
