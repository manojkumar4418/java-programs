
interface interfaceA
{
    void show();
}
  
interface interfaceB extends interfaceA
{
    void print();
}
  
// class implements both interfaces and provides
// implementation to the method.
public class InterfaceInheritance implements interfaceB
{
    @Override
    public void show()
    {
        System.out.println("manoj");
    }
  
    @Override
    public void print()
    {
        System.out.println("java developer");
    }
  
    public static void main (String[] args)
    {
        InterfaceInheritance ob1 = new InterfaceInheritance();
  
        // calling the method implemented
        // within the class.
        ob1.show();
        ob1.print();
    }
}