interface printable{  
    void print();  // creating only one method
    }  
    class A6 implements printable{  
    public void print(){System.out.println("Implementing interface method");}  //implementing method in the class
    }
    public class InterfaceEx1{ 
    public static void main(String args[]){  
    A6 obj = new A6();  
    obj.print();  // calling method which is implemented
     }  
    }  