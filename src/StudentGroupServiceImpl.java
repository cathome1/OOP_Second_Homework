import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class StudentGroupServiceImpl implements Service{
    private static List<StudentGroup> groupList;
    @Override
    public void readFromFile(String path) throws Exception {
        FileReader fr = new FileReader(path);
        Scanner sc = new Scanner(fr);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }

    @Override
    public StudentGroup createStudentGroup(List<Student> studentList, Teacher teacher, int group) {
        StudentGroup g = new StudentGroup(studentList, teacher, group);
        groupList.add(g);
        return g;
    }

    public static List<StudentGroup> getGroupList() {
        return groupList;
    }
}
