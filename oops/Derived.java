// Derived class (Child class)
class Dog extends Animal {
    // Additional method for Dog class
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog();
        myDog.eat();  // Inherited method from Animal
        myDog.bark(); // Method of Dog class
    }
}