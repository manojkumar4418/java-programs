/*Constructor is invoked at the time of Object instantiation 
which is done using "new" keyword. So, calling the constructor
 more than once on the same object may not be possible.
*/
class Test { 
    public Test() { //constructor1 
       System.out.println("constructor1");
       } 
      public Test(int n ) { //constructor2 
        System.out.println("number is:"+n);
      }}
      public class CallConstructorsWithSameObject{
      public static void main(String[] args) { 
        new Test();
        new Test(10);
      }  
     } 
     