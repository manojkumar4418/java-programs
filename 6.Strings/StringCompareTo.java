
  
public class StringCompareTo {
    public static void main(String args[])
    {
        String string1 = new String("manojkumar");
        String string2 = new String("manoj");
        String string3 = new String("kumar");
        String string4 = new String("kumar");
  
        // Comparing for String 1 < String 2
        System.out.println("Comparing " + string1 + " and " + string2 + " : " + string1.compareTo(string2));
  
        // Comparing for String 3 = String 4
        System.out.println("Comparing " + string3 + " and " + string4 + " : " + string3.compareTo(string4));
  
        // Comparing for String 1 > String 4
        System.out.println("Comparing " + string1 + " and " + string4 + " : " + string1.compareTo(string4));
    }
}