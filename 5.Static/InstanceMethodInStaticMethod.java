class Calc {
    // instance method
   
    public int product(int x, int y) {
     return x * y;
    }
  }
    public class InstanceMethodInStaticMethod
    {
    public static void main(String[] args) // this is also a main  static method
    {
     Calc calcnew = new Calc();
     //instance method in static method
     // create an instance of the class Calc
     int ans = calcnew.product(5, 3); // call the non-static method
     System.out.println(ans);
    
    }}
  
  