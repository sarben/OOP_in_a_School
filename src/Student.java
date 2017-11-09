import java.util.*;

public class Student extends Person {

    public static ArrayList<Student> allStudents = new ArrayList<Student>();

    int grade;
    boolean awesomeness;

    public Student (String name,String lastName,int grade){
        super(name,lastName);
        this.grade = grade;

    }
}