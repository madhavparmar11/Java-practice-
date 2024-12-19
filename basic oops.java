class Car {
    int number;
    String colour;
    int maxspeed;

    public void onroad() {
        System.out.println("The colour of the car is " + this.colour);
        System.out.println("The speed of the car is " + this.maxspeed);
        System.out.println("The number of the car is " + this.number);
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.colour = "black";
        c.maxspeed = 120;
        c.number = 123;
        c.onroad();
    }
}
