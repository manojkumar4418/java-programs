//Java BufferedWriter class is used to provide buffering for Writer instances. It makes the performance fast. It inherits Writer class. 
//The buffering characters are used for providing the efficient writing of single arrays, characters, and strings.
 
import java.io.*;  
public class BufferedWriterEg {  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("D:\\javafiles.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("java");  
    System.out.println("javacode"); 
    buffer.close();  
     
    }  
}  