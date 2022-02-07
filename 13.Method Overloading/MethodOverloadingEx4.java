
 
// Class 1
// Helper class
class Addition4 {
 //two methods with the same name and same number of parameters of different datatype

    // Adding two integer values
    public int add(int a, int b)
    {
         
        int sum = a + b ;
        return sum;
    }
 
    // adding two double values.
    public double add(double a, double b)
    {
 
        double sum = a + b;
        return sum;
    }
}
 
class MethodOverloadingEx4 {
    public static void main(String[] args) 
    {
 
        Addition4 ob = new Addition4();
 
        int sum2 = ob.add(1, 2);

        System.out.println(   "sum of the two integer value :" + sum2);

        double sum3 = ob.add(1.0, 6.0);

        System.out.println("sum of the two double value :"  + sum3);
    }
}