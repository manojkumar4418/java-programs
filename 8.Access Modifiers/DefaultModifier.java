//The access level of a default modifier is only within the package. 
//It cannot be accessed from outside the package. If you do not
 //specify any access level, it will be the default.
class BaseClass 
{ 
    int x = 10;
    void display()      //no access modifier indicates default modifier
       { 
           System.out.println("BaseClass::Display with 'dafault' scope"); 
       } 
} 
 
class DefaultModifier
{ 
    public static void main(String args[]) 
       {   
          //access class with default scope
          BaseClass obj = new BaseClass(); 
   
          obj.display();    //access class method with default scope
          int v1 = obj.x;
          System.out.println(v1);
       } 
}