public class StringEqualIgnoreCase {
    public static void main(String args[])
    {
        String string1 = new String("manoj");
        String string2 = new String("manoj");
        String string3 = new String("manoj");
        String string4 = new String("kumar");
        String string5 = new String("kumar");
  
        // Comparing for String 1 != String 2
        System.out.println("Comparing " + string1 + " and " + string2
                           + " : " + string1.equalsIgnoreCase(string2));
  
        // Comparing for String 3 = String 4
        System.out.println("Comparing " + string3 + " and " + string4
                           + " : " + string3.equalsIgnoreCase(string4));
  
        // Comparing for String 4 = String 5
        System.out.println("Comparing " + string4 + " and " + string5
                           + " : " + string4.equalsIgnoreCase(string5));
  
        // Comparing for String 1 != String 4
        System.out.println("Comparing " + string1 + " and " + string4
                           + " : " + string1.equalsIgnoreCase(string4));
    }
}