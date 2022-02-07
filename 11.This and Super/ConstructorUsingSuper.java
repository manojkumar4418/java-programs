class Animal{  
    Animal()
    {System.out.println("animal is created");}  
    }  
    class Dog extends Animal{  
    Dog(){  
    super();  //super keyword where super() is provided by the compiler implicitly if u remove super
    System.out.println("dog is created");  
    }  
    }  
    public class ConstructorUsingSuper{  
    public static void main(String args[]){  
    new Dog(); 
    
    }}  