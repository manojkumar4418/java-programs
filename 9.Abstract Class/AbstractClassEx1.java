abstract class Hero{  
    abstract void run();  
    
    void show(){
      System.out.println("non abstract class");
      
    }
  }  
 class Honda extends Hero{  
  void run(){System.out.println("Abstract class");} 
  
   
   

}
  public class AbstractClassEx1{
    
  public static void main(String args[]){  
   Hero obj = new Honda(); // create object in child class for abstract class
   
   obj.run();
   obj.show(); // accessing non abstract class
   
  }  
  }  