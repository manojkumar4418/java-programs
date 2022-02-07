public class StaticVarInInstanceMethod
{ 
// Instance area.
    int a = 10; //Instance variable. 
    static int b = 30; // Static variable 
// Declare an instance method. 
    void m1() 
    { 
// We can call instance variable directly from instance area without any object reference variable. 
     System.out.println("Instance variable is "+a); // Call static variable directly from instance area. 
     System.out.println("static variable is "+b); // we can also access static variable
    } 
public static void main(String[] args) 
{ 
  // Static area. 
      StaticVarInInstanceMethod t = new StaticVarInInstanceMethod(); // Object creation. 
      t.m1(); // Here, we can call instance member using object reference variable t in the static area.  
   } 
}