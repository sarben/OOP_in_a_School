public class Person {
    String name;
    String lastName;
    static int id;
    static int count = -1;

    public Person(String name,String lastName){
        this.name=name;
        this.lastName=lastName;
        this.id = makeid();
    }
    public static int makeid(){
        count+=1;
        return(count);
    }
}