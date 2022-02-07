
// Class 1
// Helper class
class Addition5 {
 //two methods with the same name, number of parameters and data type but different return Type
    /*
    The compiler does not consider the return type while differentiating the overloaded method.
    But you cannot declare two methods with the same signature 
    and different return types. It will throw a compile-time error. 
    If both methods have the same parameter types, 
    but different return types, then it is not possible.
    */
    public int add(int a, int b)
    {
         
        int sum = a + b ;// with same return type
        return sum;
    }
 
    // adding three double values.
    /*public double add(double a, double b, double c)
    {
 
        int sum = a + b + c; //with different return type
        return sum;
    }*/
}
 
class MethodOverloadingEx5 {
    public static void main(String[] args) 
    {
 
        Addition5 ob = new Addition5();
 
        double sum2 = ob.add(1, 2);

        System.out.println(   "sum of the two integer values :" + sum2);

        //int sum3 = ob.add(1.0, 2.0, 5.0);

       // System.out.println("sum of the three double values :"  + sum3);
    }
}