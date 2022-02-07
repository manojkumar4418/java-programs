class Var1 {  
  
    // static variable  
    static int a = 10;  
     
    // non-static or local variable  
    int b = 20;  
 }  
   
 public class Variables {  
    public static void main(String[] args) {  
        Var1 obj = new Var1();  
   
        // accessing the non-static variable  
        System.out.println("Value of non-static variable is: " + (obj.b));  
   
        // accessing the static variable  
        System.out.println("Value of static variable is:" + (Var1.a));  
    }  
 }  