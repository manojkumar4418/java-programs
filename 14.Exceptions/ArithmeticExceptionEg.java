public class ArithmeticExceptionEg
{
   public static void main(String args[])
   {
      try{
         int num1=10, num2=0;
         int num3=num1/num2;
         System.out.println ("Result: "+num3);
      }
      catch(ArithmeticException e){
         System.out.println ("Arithmetic error");
      }
   }
}