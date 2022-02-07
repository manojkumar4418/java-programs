interface Drawable{  
    void draw();//creating first method
    void show();  //creating second method
    }  
     
    class Rectangle implements Drawable{  
    public void draw(){System.out.println("drawing rectangle");}  //but implement only one method in the class
    public void show(){
        System.out.println("showing rectangle");
    }
    }  
    
    class InterfaceEx2{  
    public static void main(String args[]){  
    Rectangle d=new Rectangle(); 
    d.draw();  // calling the method which is implemented
    d.show();
    }}  