//Java FileOutputStream is an output stream used for writing data to a file.
import java.io.FileOutputStream;  
public class FileOutputStreamEg {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\javafiles.txt");    
             String s="java";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);   
             System.out.println("java code"); 
             fout.close();    
              
            }catch(Exception e){System.out.println(e);}    
      }    
}  