public class StringIndexOutOfBoundsExceptionEg {
    public static void main(String[] args) {
       String str = "Hello how are you";
       
       System.out.println(str.length());
       //Accessing element at greater than the length of the String
       try {
          System.out.println(str.charAt(18));
       }catch(StringIndexOutOfBoundsException e) {
          System.out.println("Exception occurred . . . . . . . . ");
       }
    }
 }