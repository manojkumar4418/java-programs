//The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
//access from subclass also
class Person{
    private String name;
    public Person(String name){
       this.name = name;
    }
    public void setName(String name) {
       this.name = name;
    }
    public String getName() {
       return this.name;
    }
    
    }
    class Student extends Person {
    public Student(String name){
       super(name);
    }
    
    }

    public class PrivateFromSubclass{
    public static void main(String[] args) {
       Student std = new Student("vinay naveen");
       System.out.println(std.getName());
    }
 }