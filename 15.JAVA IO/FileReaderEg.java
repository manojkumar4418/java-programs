//Java FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.  
  
import java.io.FileReader;  
public class FileReaderEg {  
    public static void main(String args[])throws Exception{    
          FileReader fr=new FileReader("D:\\javafiles.txt");    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }    
}    