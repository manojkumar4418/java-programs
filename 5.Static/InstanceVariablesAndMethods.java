public class InstanceVariablesAndMethods {
    // instance variable
    int myCount = 0;
    //instance method
    void increment ( ) {
        myCount = myCount + 1;
     System.out.println ("increment count = " + myCount);
    }
    // instance method
    void decrement ( ) {
        myCount = myCount - 1;
     System.out.println ("decrement count = " + myCount);
    }
    public static void main (String [] args) {
        InstanceVariablesAndMethods c1 = new InstanceVariablesAndMethods ( );// object creation to access instance variable
        c1.increment ( );  // c1's myCount is now 1
        c1.increment ( );  // c1's myCount is now 2
        InstanceVariablesAndMethods c2 = new InstanceVariablesAndMethods ( );
        c2.increment ( );  // c2's myCount is now 1
        c1.increment ( );  // c1's myCount is now 3
        c1.myCount = 0;    // effectively resets the c1 counter
        c1.increment ( );  // c1's mycount is now 1
        c1.decrement();    // c1's mycount is now 0
        c1.decrement();    // c1's mycount is now -1
    }
}