// Base Class
class Programming {
   
    // Default Constructor
    public Programming()
    {
        System.out.println("Programming");
    }
 
    // parameterized Constructor
     Programming(int i, int j)
    {
        System.out.println("Programming + +");
    }
}
class DP extends Programming {
   

    //default constructor
    public DP() { System.out.println("DP"); }
 
    
     //by default it has super keyword
  
 
    // parameterized Constructor with
    // two parameter i and j.
    public DP(int i, int j)
    {
        System.out.println("DP + +");
    }
}
 
// Main Class
public class CallConstructorFromChildClass {
   
    public static void main(String[] args)
    {
 
        // Creating obj for DP
        // class which inherits the
        // properties of class programming
      
        new DP(10,11);
        new DP();
    }
}