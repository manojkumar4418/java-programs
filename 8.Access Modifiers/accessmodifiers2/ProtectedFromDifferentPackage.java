//The protected access modifier is accessible within the package. 
//However, it can also accessible outside the package but through inheritance only.
package accessmodifiers2;
import accessmodifiers1.Protected;

public class ProtectedFromDifferentPackage extends Protected   {
    public static void main(String args[]){  
        ProtectedFromDifferentPackage a=new ProtectedFromDifferentPackage();  
       a.msg();  
       System.out.println(a.x);   
}}

