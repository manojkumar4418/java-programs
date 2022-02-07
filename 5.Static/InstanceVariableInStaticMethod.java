// Java Program to check accessibility of
// instance variables by static method
 /*We cannot access directly instance variables from a static method. Therefore,
  to access an instance variable, we must have an instance of the class
   from which we access the instance variable.and we can also say that main is also static method so,
   we can access through objectt only
 
*/ 

 public class InstanceVariableInStaticMethod {
   
    // instance variable
    public int k;
 
    // Constructor to set value to instance variable
    public InstanceVariableInStaticMethod(int k) { this.k = k; }
   
    
   
    // get method for instance variable
    public int getK() { return k; }
 
    public static void main (String[] args)
    {
 
        // Calling class  where instance variable is
        // present
        InstanceVariableInStaticMethod obj = new InstanceVariableInStaticMethod(10);
 
        // now we got instance of instance variable class
        // with help of this class we access instance
        // variable
        System.out.print("Value of k is: " + obj.getK());
    }
}