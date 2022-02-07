public class CallFromMainMethod {
  static void myMethod() {
    System.out.println("Manoj kuamr");
  }

  public static void main(String[] args) {
    myMethod();
    myMethod();// if you call n times then it returns  n times
    myMethod();
  }
}

