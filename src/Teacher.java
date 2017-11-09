public class Teacher extends Person {
    String subject;
    static int id;
    public Teacher (String name, String lastName, String subject){
        super(name, lastName);
        this.subject = subject;
    }
}