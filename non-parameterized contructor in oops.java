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

    // Copy constructor
    Car(Car car) {
        this.number = car.number;
        this.colour = car.colour;
        this.maxspeed = car.maxspeed;
    }

    public void onroad() {
        System.out.println("The colour of the car is " + colour);
        System.out.println("The speed of the car is " + maxspeed);
        System.out.println("The number of the car is " + number);
    }

    public static void main(String[] args) {
        // Create first car object
        Car c1 = new Car(1234, "black", 200);
        c1.onroad();

        // Create second car object by copying c1
        Car c2 = new Car(c1);
        c2.onroad();
    }
}
