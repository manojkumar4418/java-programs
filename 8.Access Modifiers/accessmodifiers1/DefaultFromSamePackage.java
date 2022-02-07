//The access level of a default modifier is only within the package. 
//It cannot be accessed from outside the package. If you do not
 //specify any access level, it will be the default.
 package accessmodifiers1;

public class DefaultFromSamePackage {
    public static void main(String[] args) {  
        Default a=new Default();  
        a.msg();  
        System.out.println(a.x); 
    } }

