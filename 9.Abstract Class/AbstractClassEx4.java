abstract class Abstract{  
  
  abstract void show();
  void add(int x ,int y){ }  
}
  public class AbstractClassEx4 extends Abstract{// it is subclass of bike
    
    
    void show(){
      System.out.println("Abstract method");
    }
    
    
    void add(int x, int y)//creating instances in subclass
    {
      
      System.out.println("non Abstract class and addition is:"+(x+y));
    }

  public static void main(String args[]){  
   
   Abstract obj = new AbstractClassEx4(); // create object in child class for abstract class
   obj.show(); // abstract method
   obj.add(6,3); // accessing non abstract class method
  }  
  }  