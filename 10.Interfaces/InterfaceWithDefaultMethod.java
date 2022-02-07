interface Vehicle1 {
    
     String speedUp();
    
    String slowDown();
    
    default String turnAlarmOn() {           //Creating an interface with a default method 
        return "Turning the vehicle alarm on.";
    }
    
    default String turnAlarmOff() {           //Creating an interface with a default method  
        return "Turning the vehicle alarm off.";
    }
}


class Car1 implements Vehicle1 {//implementing 

   
    
    @Override
    public String speedUp() {
        return "The car is speeding up.";
    }
    
    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }}
public class InterfaceWithDefaultMethod{
public static void main(String[] args) { 
    Car1 c = new Car1();
    
    System.out.println(c.speedUp());
    System.out.println(c.slowDown());
    System.out.println(c.turnAlarmOn());//calling default method without implementing in implemented class
    System.out.println(c.turnAlarmOff());//calling default method without implementing in implemented class
}}