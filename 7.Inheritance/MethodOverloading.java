class ABC
 { // method overloading
 public void add(int x , int y) 
 { 
 System.out.println(" addition of 2 integers :"+(x+y)); 
 } 
 } 
class BCD 
{ //method overloading
 public void add(double x , double y, double z) 
 { 
 System.out.println(" addition of 3 doubles :"+(x+y+z)); 
 } 
}
 class CDE {

    public void mul(int x , int y) 
    { 
    System.out.println(" multiplication of 2 integers : "+(x*y)); 
    }
}

class MethodOverloading
{ 
 public static void main(String[] args) 
 { 
  

 ABC obj1 = new ABC();
 BCD obj2 = new BCD();
 CDE obj3 = new CDE();
 obj1.add(1,2);
 obj2.add(0.2,2.1,0.7);
 obj3.mul(1,2);

 } }