class Employee{  
   
    String empname;  
    
    Employee(String empname){  
     
    this.empname=empname;  
    
    }  
    void display(){System.out.println(empname);}  
    }  
    public class ConstructorUsingThis{
    public static void main(String args[]){  
    Employee e1=new Employee("manoj");  // calling constructor of class student
    Employee e2=new Employee("sumit");  
    e1.display();  
    e2.display();  
    }}  