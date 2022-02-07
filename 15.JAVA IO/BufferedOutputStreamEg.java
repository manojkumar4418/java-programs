/*BufferedOutputStream(OutputStream out) Creates a new buffered output stream 
to write data to the specified underlying output stream. 
BufferedOutputStream(OutputStream out, int size) Creates a new buffered output
 stream to write data to the specified underlying output stream with the specified buffer size.
*/
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class BufferedOutputStreamEg {
    public static void main(String[] args) {

        String data = "java";

        try {
            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream("javafiles.txt");

            // Creates a BufferedOutputStream
            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

            // Writes data to the output stream
            output.write(array);
            System.out.println("java code"); 
            output.close();
             
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}