//Public modifier acceesed from anywhere outside package also
package accessmodifiers2;
import accessmodifiers1.Public;

public class PublicFromDifferentPackage {
    public static void main(String[] args) {  
        Public a=new Public();  
        a.msg();  
        System.out.println(a.x);
}}
