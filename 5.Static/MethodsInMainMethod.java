class Method1 
{  
//instance method   
void display()  
{  
System.out.println("this is instance method calling from main method.");  
}  
//static method 
static void show()  
{  
System.out.println("this is static method calling from main method.");      
}  
}  
public class MethodsInMainMethod  
{  
public static void main(String args[])  
{  
//creating an object of the class A  
Method1  obj = new Method1 ();  
//calling a the instance method by using the object of the class  
obj.display();  
//calling a static method by using the class name  
Method1 .show();  
}  
}  