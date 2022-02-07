class Student3{  
    int rollno;  
    String name;  
    float fee;  
    Student3(int rollno,String name,float fee){  
    this.rollno=rollno;  
    this.name=name;  
    this.fee=fee;  
    }  
    void display(){System.out.println(rollno+" "+name+" "+fee);}  
    }  
    public class ArgumentConstructorUsingThis{  
    public static void main(String args[]){  
    Student3 s1=new Student3(111,"ankit",5000f);  
    Student3 s2=new Student3(112,"sumit",6000f);  
    s1.display();  
    s2.display();  
    }}  