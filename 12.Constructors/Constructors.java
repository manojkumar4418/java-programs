
 
class CS
{
    int n =10;
    //default constructor
    CS(){
        System.out.println("Default constructor:"+n);
    }
    
    // constructor with one argument
    CS(String name)
    {
        System.out.println("Constructor with one " + "argument : String : " + name);
    }
 
    // constructor with two arguments
   CS(String name, int age)
    {
 
        System.out.println("Constructor with two arguments : " +    " String and Integer : " + name + " "+ age);
 
    }
 
    // Constructor with one argument but with different
    // type than previous..
    CS(long id)
    {
        System.out.println("Constructor with one argument : " +   "Long : " + id);
    }
}
 
class Constructors
{
    public static void main(String[] args)
    {
      new CS();

        
        
        // by passing different arguments
 
        new CS("Shikhar");
 
        new CS("Dharmesh", 26);
 
        new CS(32561456);
    }
}