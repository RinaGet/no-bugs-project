package homeWork2;

public class MainForTeacher {
    public static void main(String[] args) {
        Teacher myTeacher = new Teacher("Dean Winchester", "Supernatural");
        myTeacher.printInfo();

        myTeacher.setSubject("Supernatural part 2");
        myTeacher.printInfo();
    }
}
