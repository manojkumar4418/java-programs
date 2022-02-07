 /*Java FileInputStream class obtains input bytes from a file. 
 It is used for reading byte-oriented data (streams of raw bytes) 
 such as image data, audio, video etc.You can also read character-stream data.
  But, for reading streams of characters, it is recommended to use FileReader class.
 */
 import java.io.FileInputStream;  
public class FileInputStreamEg {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("D:\\javafiles.txt"); //  a text file named as "javafiles.txt" is required to be created. In this file, we have content 
            int i=0;    
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  