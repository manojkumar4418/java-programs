public class StringReplace {
    public static void main(String args[]) {
          
       // Initialising String
       String Str = new String("this is example of replace ");
         
       // Using replace to replace characters
       System.out.print("After replacing all i with e : " );
       System.out.println(Str.replace('i', 'e'));
         
       // Using replace to replace characters
       System.out.print("After replacing all a with D : " );
       System.out.println(Str.replace('a', 'D'));
         
    }
 }