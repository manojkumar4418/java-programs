//Java throws an Arithmetic exception when a calculation attempt 
//is done to divide by zero, where the zero is an integer and shows compile time error
public class ArithmeticExceptionWithoutExceptionHandling 
{
   void divide(int a,int b)
   {
      int q=a/b;
      System.out.println("Sucessfully Divided");
      System.out.println("The Value After Divide Is :-" +q);
   }
   public static void main(String[] args) 
   {
    ArithmeticExceptionWithoutExceptionHandling  obj=new ArithmeticExceptionWithoutExceptionHandling ();
      obj.divide(10,0);
   }
}