
 // two methods with the same name and same number of parameters of same type cannot possible it shows error


// Class 1
class Addition3 {
 
    // Method 1
    // Adding two integer values
    public int add(int a, int b)
    {
 
        int sum = a + b;
        return sum;
    }
 
    // Method 2
    // Adding two integer values
   /* public int add(int c, int d)
    {
 
        int sum = c + d ;
        return sum;
    }*/
}
 
// Class 2
// Main class
class MethodOverloadingEx3 {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating object of above class inside main()
        // method
        Addition3 ob = new Addition3();
 
        // Calling method to add 2 numbers
        int sum1 = ob.add(1, 2);
 
        // Printing sum of 2 numbers
        System.out.println("sum of the two integer value :"  + sum1);
 
        // Calling method to add 2 numbers
       // int sum2 = ob.add(1, 3);
 
        // Printing sum of 3 numbers
       // System.out.println( "sum of the two integer value :" + sum2);
    }
}