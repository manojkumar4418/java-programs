public class DecrementOperator {
    public static void main(String[] args) {
        int var1 = 3, var2 = 5;

        // 3 is displayed
        // Then, var1 is decreased to 2.
        //post decrement
        System.out.println(var1--);

        // var1 is decreased from 2 to 1
        // Then, var1 is displayed to 1
        //pre decrement
        System.out.println(--var1);
       
        // 4 is displayed
        // var2 is decreased  5 to 4
        //pre decrement
        System.out.println(--var2);

         // var2 is decreased from 4 to 3
        // but, var2 is displayed 4
        //post decrement
        System.out.println(var2--);
        
        
    }
}