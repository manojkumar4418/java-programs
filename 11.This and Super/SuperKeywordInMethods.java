class Animal1 { // Superclass (parent)
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Dog1 extends Animal1 { // Subclass (child)
    public void animalSound() {
      super.animalSound(); //  used to call superclass methods without override
      System.out.println("The dog says: bow wow");
    }
  }
  
  public class SuperKeywordInMethods {
    public static void main(String args[]) {
      Animal1 myDog = new Dog1(); // Create a Dog object
      myDog.animalSound(); // Call the method on the Dog object
    }
  }