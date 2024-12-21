// Abstract base class
abstract class Vehicle {
    // Constructor for Vehicle class
    Vehicle() {
        System.out.println("Vehicle is created");
    }

    // Abstract method to be implemented by subclasses
    public abstract void drive();
}

class Car extends Vehicle {
    // Constructor for Car class
    Car() {
        System.out.println("Car is created");
    }

    // Implementing the abstract drive method
    @Override
    public void drive() {
        System.out.println("This is the drive method for a car.");
    }

    // Method to display the speed of the car
    public void speed() {
        System.out.println("The speed of the car is 120 km/h.");
    }

    public static void main(String[] args) {
        Car c = new Car();  // This will call the constructors of both Vehicle and Car
        c.drive();          // This will call the overridden drive method
        c.speed();          // This will call the speed method
    }
}
