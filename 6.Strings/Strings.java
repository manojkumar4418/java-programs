
//There are two ways to create a strings in Java: 

class Strings {
    public static void main(String[] args)
    {
        // Declare String without using new operator
        String s = "Strings by String literal";
 
        // Prints the String.
        System.out.println("String s = " + s);
 
        // Declare String using new operator
        String s1 = new String("Strings Using new keyword");
 
        // Prints the String.
        System.out.println("String s1 = " + s1);
    }
}