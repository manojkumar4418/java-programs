import java.util.*;  
class ArrayListEg{  
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
      // adding 10 string elements to arrayList
      alist.add("harish");
      alist.add("ramya");
      alist.add("santhosh");
      alist.add("chandu");
      alist.add("praveen");
      alist.add("pranathi");
      alist.add("naveen");
      alist.add("vinay");
      alist.add("kumar");
      alist.add("manoj");

      //displaying elements
      System.out.println(alist);
  
      //Adding one more element to arraylist
      alist.add( "Steve");
      System.out.println("after adding an element to arraylist is:"+alist);

     //iterating arraylist by using advanced for loop
     for(String str:alist)  
     System.out.println(str);

     //Adding an element at a specific index
     alist.add( 3,"josh");
     System.out.println("after adding element at index 3 is:"+alist);

     //Removing an element from the ArrayList
     alist.remove( "Steve");
     System.out.println("after removing a element from arraylist is :"+alist);

     //Remove an element from the ArrayList by index
     alist.remove(5);
     System.out.println("after removing a element at index 5 from arraylist is :"+alist);

     //Updating the element at a specific index
     alist.set( 9,"satish");
     System.out.println("after upading arraylist is :"+alist);

     //Check the element is present at a particular index
    System.out.println("The index of the element vinay in ArrayList is: " +alist.indexOf("vinay"));

    //Getting an element at a particular index
    String element = alist.get(2);
    System.out.println("element at index of 2 is:"+element);
   
    //Find out the size of the ArrayList
    System.out.println("Number of elements in ArrayList: "+alist.size());

    // Checking the given element is present in the ArrayList
    System.out.println( "checking the element present in arraylist is:"+alist.contains("chandu") ); 
    System.out.println( "checking the element present in arraylist is:"+alist.contains("bunny") );

    //removing all elements from arraylist
    alist.clear();
    System.out.println("after removing all elements from arraylist is :"+alist);

    }  
}