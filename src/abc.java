import java.util.*;


public class abc {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        again();
    }
    public static void createSection(){
        System.out.println("What is the new section's name?");
        String name = sc.next();
        System.out.println("What is the new section's capacity?");
        int maxSize = sc.nextInt();
        System.out.println("What is the new section's current size?");
        int currentSize = sc.nextInt();
        System.out.println("Who is the new section's teacher's last name?");
        String teacher = sc.next();
        Section a = new Section(name, maxSize, currentSize, teacher);
        Section.allSections.add(a);
    }
    public static void createStudent(){
        System.out.println("What is the new student's first name?");
        String first = sc.next();
        System.out.println("What is the new student's last name?");
        String last = sc.next();
        System.out.println("What is the new students grade?");
        int grade = sc.nextInt();
        Student a = new Student(first, last, grade);
        Student.allStudents.add(a);
    }
    public static void createTeacher(){
        System.out.println("What is the new teacher's first name?");
        String first = sc.next();
        System.out.println("What is the new teacher's last name?");
        String last = sc.next();
        System.out.println("What is the new teacher's subject?");
        String subject = sc.next();
        Teacher a = new Teacher(first, last, subject);
    }
    public static void addStudent(){
        System.out.println("Which section would you like to add to?");
        String sec = sc.next().toLowerCase();
        for (int x = 0; x < Section.allSections.size(); x++){
            if (Section.allSections.get(x).name.toLowerCase().equals(sec)){
                System.out.println("What is the new student's first name?");
                String fname = sc.next();
                System.out.println("What is the new student's last name?");
                String lname = sc.next();
                for (int i = 0; i < Student.allStudents.size(); i++){
                    if (Student.allStudents.get(i).lastName.equals(lname) && Student.allStudents.get(i).name.equals(fname)) {
                        System.out.println("That student has been added.");
                        Section.allSections.get(x).students.add(Student.allStudents.get(i));
                        Section.allSections.get(x).currentSize += 1;

                    } else {
                        System.out.println("That student does not exist.");
                    }
                }
            } else {
                System.out.println("That section does not exist.");
            }
        }
    }

    public static void again(){
        System.out.println();
        System.out.println();
        System.out.println("Enter '1' to create a section. Enter '2' to create a new student. Enter '3' to create a new teacher. Enter '4' to add a student to a section.");
        System.out.println("Enter '5' to remove an existing student from a section. Enter '6' to find the total number of seats remaining in a section. Enter '7' to evaluate a section's awesomeness.");
        int choice = sc.nextInt();
        if(choice == 1){
            createSection();
            again();
        } else if (choice == 2){
            createStudent();
            again();
        } else if (choice == 3){
            createTeacher();
            again();
        } else if (choice == 4){
            addStudent();
            again();
        } else if (choice == 5){
            boolean t = false;
            System.out.println("What is the student's last name?");
            String id = sc.next();
            System.out.println("Which section would you like to remove this student from?");
            String n = sc.next();
            for (int x = 0; x < Section.allSections.size(); x++){
                if (Section.allSections.get(x).name.toLowerCase().equals(n.toLowerCase())){
                    t = true;
                    Section.allSections.get(x).removeStudent(id);
                }
            }
            if(!t){
                System.out.println("That section does not exist.");
            }
            again();
        } else if (choice == 6){
            boolean t = false;
            System.out.println("Which section would you like to calculate?");
            String c = sc.next();
            for (int y = 0; y < Section.allSections.size(); y++){
                if (Section.allSections.get(y).name.toLowerCase().equals(c.toLowerCase())){
                    t = true;
                    Section.allSections.get(y).sectionSeatsRemaining(c);
                }
            }
            if(!t){
                System.out.println("That section does not exist.");
            }
            again();
        } else if (choice == 7){
            boolean t = false;
            System.out.println("Which section would you like to evaluate?");
            String v = sc.next();
            for(int s = 0; s < Section.allSections.size(); s++){
                if (Section.allSections.get(s).name.toLowerCase().equals(v.toLowerCase())){
                    t = true;
                    Section.allSections.get(s).calculateAwesomeness(v);
                }
            }
            if(!t){
            System.out.println("That section does not exist.");
        }
            again();
        }
    }
}