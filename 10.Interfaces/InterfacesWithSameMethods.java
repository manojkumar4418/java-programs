interface Interface1 { 
	 
	public void myMethod(); 
} 
// Creating two interfaces with the same method  in both the interfaces.

/*
If two interfaces contain a method with the same signature but different return types, 
then it is impossible to implement both the interface simultaneously.
*/

/*public interface Interface2 { 
 
	public void myMethod();
} */


public class InterfacesWithSameMethods implements Interface1 { //Implementing these two interfaces in one class.
    public void myMethod() { 
	 
		System.out.println("In my Method"); 
		 
	} 
   
	 
	public static void main(String[] args) { 
		
        InterfacesWithSameMethods t1 = new InterfacesWithSameMethods(); 
       
			t1.myMethod(); //calling method
			
            
	} 
 
	
	
 
}  