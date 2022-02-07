import java.util.HashMap;


public class HashMapEg {

   
   public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String , Integer> M = new HashMap<>();

        // Adding key-value pairs to a HashMap
        // the values are student name and their id
        M.put("manoj", 1);
        M.put("kumar", 2);
        M.put("satish", 3);
        M.put("vinay", 4);
        M.put("naveen", 5);
        M.put("chandu", 6);
        M.put("santhosh", 7);
        M.put("ramya", 8);
        M.put("pranathi", 9);
        M.put("priya", 10);
       
      System.out.println(M);

       //Inserting a Key value mapping into the map
        M.put("harry", 2);
        System.out.println("after inserting a key value map is :"+M);

        //Fetching the value of a Key
        System.out.println("fetching the id of student vinay is  :"+M.get("vinay"));

        //Create a clone/copy of HashMap
        System.out.println("copy of hashmap of student names and id's is:"+M.clone());

        //  Check if the given Key is in the Map
        System.out.println("Is the key pranathi present? " +M.containsKey("pranathi")); 
        System.out.println("Is the key prannu present? " +M.containsKey("prannu")); 

        
        //Check if the map is empty
        System.out.println("Is the map empty? " + M.isEmpty());

        //print the size of the hashmap
        System.out.println("The size of the map is " + M.size());

        //print all the keys of the hashmap
        System.out.println("all keys are:");
        for(String key: M.keySet()){
         System.out.println(key); }

         //print all values of hashmap
         System.out.println("all values are:");
         for(Integer value: M.values()){
          System.out.println(value);}

         //Removing a specific Key-value pair
         M.remove("vinay");
         System.out.println("after remove vinay :"+M);

         //Copy all the elements of the Map to another Map
         HashMap< String, Integer> M2 = new HashMap< String, Integer>();
         M2.putAll(M);
         System.out.println("copy of hashmap is  :"+M2);

}}


