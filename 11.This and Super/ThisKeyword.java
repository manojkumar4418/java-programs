class ThisKeyword
{
    int a;
    int b;
     //Using ‘this’ keyword to refer current class instance variables
    // Parameterized constructor
    ThisKeyword(int a, int b)
    {
        this.a = a; //using this keyword
        this.b = b;// using this keyword
    }
 
    void display()
    {
        //Displaying value of variables a and b
        System.out.println("a = " + a + "  b = " + b);
    }
 
    public static void main(String[] args)
    {
        
        ThisKeyword object = new ThisKeyword(10, 20);
        object.display();
    }
}