// Interface shape
interface Shape {
    public abstract void getArea();
    public abstract void getPerimeter();
}

// Class circle implements shape
class Circle implements Shape {
    int radius;

    // Constructor for Circle
    Circle(int radius) {
        this.radius = radius;
        System.out.println("This is a circle.");
    }

    // Implementing getArea method
    @Override
    public void getArea() {
        System.out.println("Area of the circle is: " + 3.14 * radius * radius);
    }

    // Implementing getPerimeter method
    @Override
    public void getPerimeter() {
        System.out.println("Perimeter of the circle is: " + 3.14 * 2 * radius);
    }

    // Main method
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.getArea();
        c.getPerimeter();
    }
}
