package circles;

public class Circles {
    // This is a private variable
    private double radius;
    // This is a static variable
    private static int numOfObjects = 0;
    
    // An overloading constructors
    // This is a no-argument constructor
    Circles() {
        this.radius = 1;
        numOfObjects++;
        System.out.println("An object is created");
    }
 
    // This is a constructor with arguments
    Circles(double radius) {
        this.radius = radius;
        numOfObjects++;
        System.out.println("An object is created with a radius " + radius);
    }
    
    // This is a method to calculate the area
    public double getArea() { return Math.PI * this.radius * this.radius; }
    
    // This is a method to calculate the perimeter
    public double getPerimeter() { return 2 * Math.PI * this.radius; }
    
    // This is a setter / mutator method
    public void setRadius(double newRadius) { this.radius = newRadius; }
    
    // This is a getter / accessor method
    public double getRadius() { return this.radius; }
    
    public static int getNumOfObjects() { return numOfObjects; }
}
