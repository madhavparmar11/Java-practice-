// Base class
abstract class Employee {
    // Constructor for Employee class
    Employee() {
        System.out.println("Employee class constructor called");
    }

    // Abstract method to be implemented by subclasses
    public abstract void work();

    // Abstract method to be implemented by subclasses
    public abstract void getSalary();
}

// Derived class Hero
class Hero extends Employee {
    // Constructor for Hero class
    Hero() {
        super(); // Calls the constructor of the Employee class
        System.out.println("Hero class constructor called");
    }

    // Implementing the abstract work method
    @Override
    public void work() {
        System.out.println("Hero is working");
    }

    // Implementing the abstract getSalary method
    @Override
    public void getSalary() {
        System.out.println("Hero gets salary");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object of Hero class
        Hero hero = new Hero();

        // Calling implemented methods
        hero.work();
        hero.getSalary();
    }
}
