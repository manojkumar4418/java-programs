//A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.
/*
In the example given below, both the classes have a data member speed. 
We are accessing the data member by the reference variable of Parent class 
which refers to the subclass object. Since we are accessing the data member 
which is not overridden, hence it will access the data member of the Parent class always.
*/
class PV{  
    int speed=90;  
   }  
    class PV1 extends PV{  
    int speed=150;
  
   
} 
     public class Polymorphismwithvariables{
    public static void main(String args[]){  
    PV obj=new PV1();  
     System.out.println(obj.speed);//90  
   } 
 }