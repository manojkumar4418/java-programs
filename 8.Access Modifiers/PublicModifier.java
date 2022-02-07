//The public access modifier is accessible everywhere. It has the widest scope among all other modifiers.

class A 
{ 
public void display() 
    { 
        System.out.println("Public modifier acceesed from anywhere"); 
    } 
}
class B extends A{
    public int x =10;
    public void show(){
    System.out.println("Public modifier acceesed from anywhere outside package also");
}
}
public class PublicModifier {
    public static void main(String args[])
    {
        B obj = new B();
        obj.display();
        obj.show();
       int v1 = obj.x;
       System.out.println(+v1);
    }
}