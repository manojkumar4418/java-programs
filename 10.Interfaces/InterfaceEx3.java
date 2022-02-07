interface Addition{  
    void add(int x,int y);//creating interface instances
    }  
     
    class Additioniml implements Addition{  
    public void add(int x ,int y)// implementing interface method in the class
    {System.out.println("addition of two integers is:"+(x+y));
    }  
    }  
    
    class InterfaceEx3{  
    public static void main(String args[]){  
    Addition d=new Additioniml(); 
    d.add(2,5);  // calling the method with instances which is implemented 
    }
}  