class ABCD{ 
 
  // override method
 
 public void show() 
 { 
 System.out.println(" Ovverride method class A "); 
  } 
 
      // method with different name in all classes

      public void M1() 
      { 
      System.out.println(" ClassA "); 
      }
         //overloading method
          public void add(double x , double y) 
          { 
          System.out.println(" addition of 2 doubles "+(x+y)); 
        } 

 } 

 class BCDE extends ABCD
 {
    //override method
 
   public void show() 
 { 
 System.out.println(" Ovverride method class B "); 
 } 
 
      // method with different name in all classes
      public void M2() 
     { 
     System.out.println(" classB subclass of ClassA "); 
     } 

          //overloading method
          public void add(int x , int y) 
          { 
          System.out.println(" addition of 2 integers "+(x+y)); 
          } 
 }


 class CDEF extends BCDE{
    
    //override method
    public void show() 
    { 
    System.out.println(" Ovverride method of  class C"); 
    }

           // method with different name in all classes
    
           public void M3() 
           { 
           System.out.println(" classC subclass of ClassB "); 
           } 

               // overloading method
 
               public void add(int x , int y , int z) 
               { 
               System.out.println(" addition of 3 integers "+(x+y+z)); 
               } 
}

public class MethodOverriding
 { 
 public static void main(String[] args) 
 { 
   
 CDEF d = new CDEF(); // creating object 
 d.M1();
 d.M2();
 d.M3();
 d.add(5,2);
 d.add(5,2,1);
 d.add(5.2 ,6.4);
 d.show(); 
 } 
 }