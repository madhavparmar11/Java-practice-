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
    public static void onroad(int speed) {
        System.out.println("The speed of the car is " + speed);
    }

    public void onroad(String colour) {
        System.out.println("The colour of the car is " + colour);
    }

    public void onroad(int number, int maxspeed, String colour) {
        System.out.println("The number of the car is " + number + ", the max speed of the car is " + maxspeed + ", and the colour of the car is " + colour);
    }

    public static void main(String[] args) {
        // Create a Car object
        Car c = new Car(1234, "black", 200);

        // Call different overloaded methods
        c.onroad(c.maxspeed); // Calls the method with an int parameter
        c.onroad(c.colour);   // Calls the method with a String parameter
        c.onroad(c.number, c.maxspeed, c.colour); // Calls the method with three parameters
    }
}
