
public class StringMatches {

   public static void main(String args[]) {
      String Str = new String("this is matches example in strings");

      System.out.print("Return Value :" );
      System.out.println(Str.matches("(.*)matches(.*)"));

      System.out.print("Return Value :" );
      System.out.println(Str.matches("matches"));

      System.out.print("Return Value :" );
      System.out.println(Str.matches("(.*)strings"));

      System.out.print("Return Value :" );
      System.out.println(Str.matches("(.*)this"));

   }
}