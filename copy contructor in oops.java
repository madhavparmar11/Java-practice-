class Car {
    int number;
    String colour;
    int maxspeed;

    // Constructor with corrected name
    Car(int number, String colour, int maxspeed) {
        this.colour = colour;
        this.number = number;
        this.maxspeed = maxspeed;
    }

    public void onroad(int speed) {
        System.out.println("The speed of the car is " + maxspeed);
    }
    public void onroad(string colour){
        System.out.println("The colour of the car is " + colour);
    }
    public void onroad(int maxspeed){
        System.out.println("The max speed of the car is " + maxspeed);
    }
    public void onroad(int number, int maxspeed, String colour){
        System.out.println("The number of the car is " + number + " The max speed of the car is" +maxspeed + "the colur of the car is" + colour);
    }

    public static void main(String[] args) {
        // Corrected parameter order in constructor
        Car c = new Car(1234, "black", 200);
        c.onroad(c.maxspeed);
    }
}
