import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List<Student> studentList;
    private int groupNumber;

    public StudentGroup(List<Student> studentList, Teacher teacher, int groupNumber) {
        this.teacher = teacher;
        this.studentList = studentList;
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }
}
