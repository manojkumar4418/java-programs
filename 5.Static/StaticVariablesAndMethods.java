
class StaticVariablesAndMethods{
    //Static variables
    static int age;
    static String fname;
    static String lname;
    public int marks;
    //This is a Static Method
    static void disp(){
        System.out.println("Age is: "+age);
        System.out.println("Name is: "+fname);
      

    }
    // this is one more static method
    static void add(){
        System.out.println("fullName is: "+fname + lname);


    }
    // This is also a static method
    public static void main(String args[]) 
    {
        age = 30;
        fname = "Steve";
        lname = "joseph";
        disp();
        add();
    }
  }