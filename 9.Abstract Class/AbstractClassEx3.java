abstract class Demo{  
    abstract void mul(int x, int y);  
    
   
  }  
 
  public class AbstractClassEx3 extends Demo{// it is subclass of bike
    
    void mul(int x, int y)//creating instances in subclass
    {
      
      System.out.println("Abstract class and multiplication is:"+(x+y));
    }

  public static void main(String args[]){  
    Demo obj = new AbstractClassEx3(); // create object in child class for abstract class
   
  
   obj.mul(6,3); // accessing abstract class method
  }  
  }  