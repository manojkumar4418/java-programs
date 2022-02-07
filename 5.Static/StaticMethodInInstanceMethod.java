public class StaticMethodInInstanceMethod{
   
    static int add()     // static method
    {
        int x =10, y= 20;   
    int z = x+y;
    return z;
    }
    void disp()      //instance variable
    {  
        int a =add();     // calling static method in instance method
    
        System.out.println("addition is :"+a);
    }

    public static void main(String[] args)
{
    StaticMethodInInstanceMethod obj = new StaticMethodInInstanceMethod();
    
    obj.disp();
     
}
}
