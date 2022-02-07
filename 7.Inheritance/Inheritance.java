class AB
 { 
 public void M1() 
 { 
 System.out.println(" ClassA "); 
 } 
 } 
class BC extends AB
{ 
 public void M2() 
 { 
 System.out.println(" classB subclass of classA "); 
 } 
}
 class CD extends BC{

    public void M3() 
    { 
    System.out.println(" classC subclass of classD"); 
    }
}

class Inheritance 
{ 
 public static void main(String[] args) 
 { 
 CD d = new CD(); // creating object 
 d.M1(); // print Base Class Method 
 d.M2();
 d.M3(); // print Derived Class Method 
 } 
} 