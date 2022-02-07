interface Test1 {// creating first interface
    void show();
}
interface Test2 {//creating second interface
    void print();
}
public class InterfacesWithDifferentMethods implements Test1 , Test2  //implementing two interfaces
{ 
    public void show(){
        System.out.println("Implemented method of interface1");//implementing interface1 method
    }
    public void print(){
        System.out.println("Implemented method of interface2");//implementing interface2 method
    }
 
    public static void main(String[] args) 
    { 
        Test1 obj1 = new InterfacesWithDifferentMethods();// creating object for interface1
        Test2 obj2 = new InterfacesWithDifferentMethods();// creating object for interface2
        obj1.show();// calling method of interface1
        obj2.print();// calling method of interface2
    } 
}