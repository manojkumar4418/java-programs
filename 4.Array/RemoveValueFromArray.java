import java.util.Arrays; 
public class RemoveValueFromArray {
 
public static void main(String[] args) {
   int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   
   System.out.println("Original Array : "+Arrays.toString(array));     
   
  // Remove the forth element (index->3, value->15) of the array
   int removeIndex = 3;

   for(int i = removeIndex; i < array.length -1; i++){
        array[i] = array[i + 1];
      }
// We cannot alter the size of an array , after the removal, the last and second last element in the array will exist twice
    System.out.println("After removing the element: "+Arrays.toString(array));
 }
 }
