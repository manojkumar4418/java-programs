
 interface MyInterface{
    public  int num = 10;//Creating a PUBLIC interface with fields and methods
    public void display();
 }
 public class PublicFieldsInInterface implements MyInterface{//implementing interface
    public  int num = 10000;
    public void display() {
       System.out.println("This is the implementation of the display method of  myinterface");
    }
   
    public static void main(String args[]) {
      PublicFieldsInInterface obj = new PublicFieldsInInterface();
       System.out.println("Value of num of the interface "+MyInterface.num);// calling interfacde field
       System.out.println("Value of num of the class "+obj.num);
       obj.display();//calling interface method
    }
 }