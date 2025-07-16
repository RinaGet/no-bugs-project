package homeWork2;

public class StudentGroup {
    private String groupName;
    private int studentCount;

    public StudentGroup(String groupName, int studentCount){
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    public String getGroupName(){
        return this.groupName;
    }

    public int getStudentCount(){
        return this.studentCount;
    }

    public void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }

    public void setStudentCount(int newStudentCount){
        this.studentCount = newStudentCount;
    }

    public void printInfo(){
        System.out.println("Group name is: " + groupName + ". Student count is: " + studentCount);
    }
}
