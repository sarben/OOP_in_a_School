import java.util.ArrayList;


public class Section {
    public static ArrayList<Section> allSections = new ArrayList<Section>();
    //for all students in every section
    String name;
    int maxSize;
    int currentSize;
    ArrayList<Student> students = new ArrayList<Student>();
    //for students in a particular section
    String teacher;


    public Section(String name, int maxSize, int currentSize, String teacher){
        this.name=name;
        this.maxSize=maxSize;
        this.currentSize=currentSize;
        this.teacher = teacher;
        this.students = students;
    }

    public void removeStudent(String id) {
        boolean t = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).lastName.toLowerCase().equals(id.toLowerCase())) {
                students.remove(students.get(i));
                currentSize = currentSize + 1;
                t = true;
                System.out.println("That student has been removed.");
            }
        }
        if (!t) {
            System.out.println("Error: could not locate last name.");
        }
    }

    public boolean calculateAwesomeness(String v) {
        boolean awesomeness;
        if (sectionSeatsRemaining(v) <= 5) {
            awesomeness = true;
            System.out.print("This section is awesome!");
        } else {
            awesomeness = false;
            System.out.println("This section is not awesome.");
        }
        return awesomeness;
    }
    public int sectionSeatsRemaining(String c) {
        for(int i = 0; i < allSections.size(); i++) {
            if(allSections.get(i).name.toLowerCase().equals(c.toLowerCase())) {
                int x = allSections.get(i).maxSize - allSections.get(i).currentSize;
                System.out.println(x);
                return x;
            }
        }
        System.out.println("Error: could not locate all variables.");
        return(2);
    }
}