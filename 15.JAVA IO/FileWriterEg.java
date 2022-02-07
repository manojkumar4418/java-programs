//Java FileWriter class is used to write character-oriented data to a file. It is character-oriented class which is used for file handling in java.
import java.io.FileWriter;  
public class FileWriterEg {  
    public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("D:\\javafiles.txt");    
           fw.write("java"); 
           System.out.println("java code");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
            
     }    
}  