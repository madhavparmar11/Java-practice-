// Base class
class Employee {
    // Constructor for Employee class
    Employee() {
        System.out.println("Employee class constructor called");
    }

    // Method to be overridden in subclasses
    public void work() {
        System.out.println("Employee is working");
    }

    public void getSalary() {
        System.out.println("Employee gets salary");
    }
}

// Derived class Hero
class Hero extends Employee {
    // Constructor for Hero class
    Hero() {
        super(); // Calls the constructor of the Employee class
        System.out.println("Hero class constructor called");
    }

    // Overriding the work method
    @Override
    public void work() {
        System.out.println("Hero is working");
    }

    // Overriding the getSalary method
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
        
        // Calling overridden methods
        hero.work();
        hero.getSalary();
    }
}
