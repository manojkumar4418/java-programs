
 
// Class 1
// Helper class
class Addition2 {
 //two methods with the same name but different number of parameters of different data type
    // Adding two integer values
    public int add(int a, int b)
    {
         
        int sum = a + b ;
        return sum;
    }
 
    // adding three double values.
    public double add(double a, double b, double c)
    {
 
        double sum = a + b + c;
        return sum;
    }
}
 
class MethodOverloadingEx2 {
    public static void main(String[] args) 
    {
 
        Addition2 ob = new Addition2();
 
        int sum2 = ob.add(1, 2);

        System.out.println(   "sum of the two integer values :" + sum2);

        double sum3 = ob.add(1.0, 2.0, 3.0);

        System.out.println("sum of the three double values :"  + sum3);
    }
}