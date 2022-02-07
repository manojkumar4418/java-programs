public class IncrementOperator {
    public static void main(String[] args) {
        int var1 = 10, var2 = 5;

        // 10 is displayed
        // Then, var1 is increased to 11.
        //post increment
        System.out.println(var1++);

        // var1 is increased from 11 to 12
        // Then, var1 is displayed to 12
        //pre increment
        System.out.println(++var1);
       
        // 6 is displayed
        // var2 is increased to 6
        //pre increment
        System.out.println(++var2);

         // var2 is increased from 6 to 7
        // but, var2 is displayed 6
        //post increment
        System.out.println(var2++);
        
        
    }
}