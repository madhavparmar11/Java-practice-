public class Animal {
    // Constructor for Animal class
    Animal() {
        System.out.print("This is the creation of an animal. ");
    }

    // Method to be overridden in subclasses
    public void makeSound() {
        System.out.print("Animal makes a sound. ");
    }
}

class Cat extends Animal {
    // Constructor for Cat class
    Cat() {
        System.out.print("This is the creation of a cat. ");
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.print("Meow ");
    }

    public static void main(String[] args) {
        Cat c = new Cat();  // This will call the constructor of both Cat and Animal
        c.makeSound();      // This will call the overridden method
    }
}
