public class NumberFormatExceptionEg {  
  
    static final String inputString = "123.33";   
      
    public static void main(String[] args) {  
        try {  
                 Integer.parseInt(inputString);  
        }catch(NumberFormatException ex){  
            System.out.println("Invalid string in argumment");  
            //request for well-formatted string  
        }  
            }  
}  