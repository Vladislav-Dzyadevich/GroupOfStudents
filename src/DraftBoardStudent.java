import java.util.ArrayList;
import java.util.List;

public class DraftBoardStudent implements DraftBoard {

    @Override
    public List<Student> studentsForArmy(List<Student> student) {
        List<Student> readyStudents = new ArrayList<>();
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i) != null && student.get(i).getAge() >= 18
                    && student.get(i).getSex().equalsIgnoreCase("Man")) {
                readyStudents.add(student.get(i));
            }
        }

        return readyStudents;
    }

}