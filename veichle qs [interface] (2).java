// Interface base class
interface Vehicle {
    // Abstract method to be implemented by subclasses
    void drive();
}

class Car implements Vehicle {
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
        Car c = new Car();  // Calls the constructor of the Car class
        c.drive();          // Calls the overridden drive method
        c.speed();          // Calls the speed method
    }
}
