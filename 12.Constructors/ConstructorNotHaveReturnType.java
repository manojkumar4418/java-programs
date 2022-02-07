/*No, constructor does not have any return type in Java.

Constructor looks like method but it is not. It does not have
 a return type and its name is same as the class name. Mostly it is used to 
 instantiate the instance variables of a class.
*/
 class DemoTest{
    String name;
    int age;
    
    DemoTest(String name, int age){//we cant use void for constructor
      // it doest not have return type
        this.name = name;
       this.age = age;
       System.out.println("This is the constructor of the demotest");
       System.out.println("name is:"+name);
       System.out.println("age is:"+age);
    }
    }
    public class ConstructorNotHaveReturnType{
    public static void main(String args[]){
       
       new DemoTest("manoj",21);
       
       
    }
 }