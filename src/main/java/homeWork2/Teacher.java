package homeWork2;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public String getName(){
        return this.name = name;
    }

    public String getSubject(){
        return this.subject = subject;
    }

    public void setSubject(String newSubject){
        this.subject = newSubject;
    }

    public void printInfo(){
        System.out.println("Teacher's  name: " + getName() + ". Teacher's subject: " + getSubject());
    }
}
