
 //Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
//	constructors Cannot be abstract, final, native, static, or synchronized
 class Demo5
{
    int n =10;
    // constructor With public
     public Demo5(){
        System.out.println("constructor with public ");
    }
    //Protected: The access level of a protected modifier is within the package and outside the package
    // through child class. If you do not make the child class, it cannot be accessed from outside the package.
    
    // constructor with protected
    protected Demo5(String name)
    {
        System.out.println("Constructor with protected " );
    }
    //Default: The access level of a default modifier is only within the package. It 
    //cannot be accessed from outside the package. If you do not specify any access level, it will be the default
    
    // constructor with default
     Demo5(String name, int age)
    {
 
        System.out.println("Constructor with default "  );
 
    }
 

}
 
class AccessModifiersInConstructors
{
    public static void main(String[] args)
    {
      new Demo5();

        
        
        // by passing different arguments
 
        new Demo5("Shikhar");
 
        new Demo5("Dharmesh", 26);
 
       
    }
}