public class ThisKeywordInMethods {
    String name;
   public void setdata(String name){
   this.name =name;// use this keyword in method 
   }
    public void showdata() {
       System.out.println("name: "+name);
    }
    public static void main(String args[]) {
        ThisKeywordInMethods obj = new ThisKeywordInMethods();
      
       obj.setdata("manoj");
       obj.showdata();
    }
 }