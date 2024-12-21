// Base class
class Employee {
    private String name;   // Employee name
    private double salary; // Employee salary

    // Constructor for Employee class
    Employee() {
        System.out.println("Employee class constructor called");
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to be overridden in subclasses
    public void work() {
        System.out.println("Employee is working");
    }
}

// Derived class Hero
class Hero extends Employee {
    private String superpower; // Hero's unique attribute

    // Constructor for Hero class
    Hero() {
        super(); // Calls the constructor of the Employee class
        System.out.println("Hero class constructor called");
    }

    // Getter for superpower
    public String getSuperpower() {
        return superpower;
    }

    // Setter for superpower
    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    // Overriding the work method
    @Override
    public void work() {
        System.out.println("Hero is working with superpower: " + superpower);
    }

    // Overriding the getSalary method
    @Override
    public void setSalary(double salary) {
        super.setSalary(salary); // Calls the base class method
        System.out.println("Hero gets a salary of: " + salary);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object of Hero class
        Hero hero = new Hero();

        // Using setters to set attributes
        hero.setName("John Doe");
        hero.setSuperpower("Flying");
        hero.setSalary(5000);

        // Using getters and displaying information
        System.out.println("Hero's Name: " + hero.getName());
        System.out.println("Hero's Superpower: " + hero.getSuperpower());

        // Calling methods
        hero.work();
        System.out.println("Hero's Salary: " + hero.getSalary());
    }
}
