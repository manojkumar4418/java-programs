// Java Program to Illustrate ClassNotFoundException
public class ClassNotFoundExceptionEg {
 
    // Main driver method
    public static void main(String args[])
    {
 
        // Try block to check for exceptions
        try {
 
            Class.forName("manojkumar");
        }
 
        // Catch block to handle exceptions
        catch (ClassNotFoundException ex) {
            
            System.out.println("classnotfound exception occurs");  
            
        }
    }
}