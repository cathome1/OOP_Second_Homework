import java.util.List;

public interface Service {
    void readFromFile(String path) throws Exception;
    StudentGroup createStudentGroup(List<Student> studentList, Teacher teacher, int group);

}
