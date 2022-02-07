abstract class Bike{  
    abstract void run();  
    
    void add(int x ,int y){
      System.out.println("Non abstract method and addition is :"+(x+y));
      
    }
  }  
 
  public class AbstractClassEx2 extends Bike{// it is subclass of bike
    
    void run(){System.out.println("Abstract class");}

  public static void main(String args[]){  
   Bike obj = new AbstractClassEx2(); // create object in child class for abstract class
   
   obj.run();
   obj.add(5,2); // accessing non abstract class
  }  
  }  