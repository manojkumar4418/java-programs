public class VariablesInMainMethod{
	public static int staticvariable;
	int instancevariable = 5;
	public static int a = 10;
  int b = 15 ;
	public static void main(String args[]){
    VariablesInMainMethod object=new  VariablesInMainMethod();// object creation
		staticvariable = 2;
    System.out.println("the value of staticvariable is "+staticvariable);
    System.out.println("the value of instancevariable is "+object.instancevariable);
    System.out.println("the value of a is "+a);
    System.out.println("the value of b is "+object.b);
	}
}