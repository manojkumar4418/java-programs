import java.util.*;  
class HashSetEg{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    HashSet<String> set= new HashSet<>();  
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Five"); 
           set.add("six");    
           set.add("seven");    
           set.add("eight");   
           set.add("nine");  
           set.add("ten");  
           
           //iteration
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
           System.out.println(set);  
           
           //Removing specific element from HashSet  
            set.remove("ten");  
            System.out.println("After invoking remove(object) method: "+set);  
           
            HashSet<String> set1=new HashSet<String>();  
            set1.add("eleven");  
            set1.add("twelve");  
            set.addAll(set1);  
            System.out.println("Updated List: "+set);  
            
            //Removing all the new elements from HashSet  
            set.removeAll(set1);  
            System.out.println("After invoking removeAll() method: "+set);  
           
            //Removing elements on the basis of specified condition  
            set.removeIf(str->str.contains("fifteen"));    
            System.out.println("After invoking removeIf() method: "+set);  
            
            //Removing all the elements available in the set  
            set.clear();  
            System.out.println("After invoking clear() method: "+set); 
            
            //HashSet from another Collection of arraylist
            ArrayList<String> list=new ArrayList<String>();  
           list.add("twenty");  
           list.add("thirty");  
           list.add("forty");  
             
           HashSet<String> set2=new HashSet<>(list);  
           set2.add("fifty"); 
           System.out.println(set2);
 }  
}  