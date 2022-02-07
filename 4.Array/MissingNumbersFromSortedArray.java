
 
class MissingNumbersFrom{
     
// Function to find the missing elements
static void printMissingElements(int arr[] , int N)
{
 
    // Initialize diff
    int diff = arr[0] - 0;
 
    for(int i = 0; i < N; i++)
    {
 
        // Check if diff and arr[i]-i
        // both are equal or not
        if (arr[i] - i != diff)
        {
 
            // Loop for consecutive
            // missing elements
            while (diff < arr[i] - i)
            {
                System.out.print((i + diff) + " ");
                diff++;
            }
        }
    }
}
 
// Driver Code
public static void main (String[] args)
{
     System.out.println("missing values from 1 to 100 in the array");
    // Given array arr[]
   int arr[] = { 1,6, 7, 10, 11,20,30,40,54,89,67,90, 100 };
    
    
    int N = arr.length;
     
    // Function call
    printMissingElements(arr, N);
}
}
 