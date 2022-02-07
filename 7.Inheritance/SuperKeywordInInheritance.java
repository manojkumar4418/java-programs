class X
 { 
 public void disp() 
 { 
 System.out.println(" ClassA "); 
 } 
 } 
class Y extends X
{ 
 public void disp() 
 { 
     super.disp(); // by super keyword it neglect overriding
 System.out.println(" classB subclass of classA "); 
 } 
}
 class Z extends Y{

    public void disp() 
    { super.disp();// by super keyword it neglect overriding
    System.out.println(" classC subclass of classB"); 
    }
}

class SuperKeywordInInheritance 
{ 
 public static void main(String[] args) 
 { 
 X d = new Z(); // creating object 
 d.disp();
 } 
} 