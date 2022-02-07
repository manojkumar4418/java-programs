class LogicalOperators {
    public static void main(String[] args) {
  
      // && operator (Logical AND)returns true if both are true
      System.out.println((5 > 3) && (8 > 5));  // true
      System.out.println((5 > 3) && (8 < 5));  // false
  
      // || operator (Logical OR)returns true if one true
      System.out.println((5 < 3) || (8 > 5));  // true
      System.out.println(5 > 3);  // true
      System.out.println((5 < 3) || (8 < 5));  // false
  
      // ! operator (Logical NOT)retuns true if it is false and viceversa
      System.out.println(!(5 == 3));  // true
      System.out.println(!(5 > 3));  // false
    }
  }