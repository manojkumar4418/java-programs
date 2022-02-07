
//it is not possible to define private and protected modifiers for the members in interfaces in Java
interface PrivateMemberInterface {
    public static int num = 100;
    //private String str = "There will be an error.";// it will show error
    //protected static int n =10;
    void display();
}

public class PrivateFieldsInInterface implements PrivateMemberInterface {
   
    public void display() {
        System.out.print("Private and protected  modifiers not allowed in interface");
       
    }

    public static void main(String[] args) {
        // class instantiation
        PrivateFieldsInInterface m = new PrivateFieldsInInterface();
        System.out.println("public variable is:"+num);
        // calling display() 
        m.display();

        // Accessing public member of an interface
        
    }
}