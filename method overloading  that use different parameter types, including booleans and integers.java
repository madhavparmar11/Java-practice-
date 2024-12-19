class Car {
    int number;
    String colour;
    int maxspeed;

    // Parameterized constructor
    Car(int number, String colour, int maxspeed) {
        this.colour = colour;
        this.number = number;
        this.maxspeed = maxspeed;
    }

    // Overloaded methods
    public int onroad(int speed) {
        System.out.println("The speed of the car is " + speed);
        return speed;
    }

    public void onroad(String colour) {
        System.out.println("The colour of the car is " + colour);
    }

    public void onroad(int number, int maxspeed, String colour) {
        System.out.println("The number of the car is " + number + ", the max speed of the car is " + maxspeed + ", and the colour of the car is " + colour);
    }

    public boolean onroad() {
        if (number == 0) {
            return false;
        }
        return true; // Ensures the method always returns a boolean value
    }

    public static void main(String[] args) {
        // Create a Car object
        Car c = new Car(1234, "black", 200);

        // Call different overloaded methods
        int speed = c.onroad(c.maxspeed); // Calls the method with an int parameter
        System.out.println("Returned speed: " + speed);

        c.onroad(c.colour);   // Calls the method with a String parameter
        c.onroad(c.number, c.maxspeed, c.colour); // Calls the method with three parameters

        // Call the boolean onroad() method
        boolean isCarOnRoad = c.onroad();
        System.out.println("Is the car on the road? " + isCarOnRoad);
    }
}
