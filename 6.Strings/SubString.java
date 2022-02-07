public class SubString {
    public static void main(String args[])
    {
 
        // Initializing String
        String Str = new String("manoj kumar");
 
        // Printing original string
        System.out.print("The original string  is : ");
        System.out.println(Str);
 
        // using substring() to extract substring
        // returns 1000
        System.out.print("The extracted substring  is : ");
        System.out.println(Str.substring(2,6)); //extracted by this index numbers
    }
}