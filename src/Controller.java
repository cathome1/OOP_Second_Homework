public class Controller {
    private StudentGroup studentGroup;

    public Controller(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public StudentGroup createGroup(int groupNumber){
        for (int i = 0; i < StudentGroupServiceImpl.getGroupList().size(); i++) {
            if (StudentGroupServiceImpl.getGroupList().get(i).getGroupNumber() == groupNumber) {
                return StudentGroupServiceImpl.getGroupList().get(i);
            }
        }
        System.out.println("not found");
        return null;
    }
}
