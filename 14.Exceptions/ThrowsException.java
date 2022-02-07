//In case we declare the exception, if exception does not occur, the code will be executed fine.
//In case we declare the exception and the exception occurs, it will be thrown at runtime because throws does not handle the exception.

// Java program to demonstrate working of throws
class ThrowsException
{
    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("caught in main.");
        }
    }
}