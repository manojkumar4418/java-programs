
// Java program to demonstrate
// static method in Interface.
 
interface NewInterface2 {
   
   final int x =10;// final variable
   static int y = 50;//static variable
   
   // static method
   static void hello()
   {
       System.out.println("static varoiable:"+y);
       System.out.println("final varoiable:"+x);
   }
  
   // Public and abstract method of Interface
   void overrideMethod(String str);
}

// Implementation Class
public class StaticAndFinalOfInterface implements NewInterface2 {

   public static void main(String[] args)
   {
      StaticAndFinalOfInterface interfaceDemo = new StaticAndFinalOfInterface();

       // Calling the static method of interface
       NewInterface2.hello();
       

       // Calling the abstract method of interface
       interfaceDemo.overrideMethod("Hello, Override Method here");
   }

   // Implementing interface method

   @Override
   public void overrideMethod(String str)
   {
       System.out.println(str);
   }
    
}