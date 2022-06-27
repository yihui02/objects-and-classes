package circles;

public class CirclesApp {  
    public static void main(String[] args) {
        // Create an object using a no-arg constructor
        Circles circle1 = new Circles();
        Circles circle2 = new Circles();
        // Create an object using a constructor with argument
        Circles circle3 = new Circles(5.5);
        
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area of Circle 1: " + circle1.getArea());
        System.out.println("Perimeter of Circle 1: " + circle1.getPerimeter());
        
        // Changing the radius of circle2 to 7
        circle2.setRadius(7);
        System.out.println("Area of Circle 2: " + circle2.getArea());
        System.out.println("Perimeter of Circle 2: " + circle2.getPerimeter());
        
        System.out.println("Area of Circle 3: " + circle3.getArea());
        System.out.println("Perimeter of Circle 3: " + circle3.getPerimeter());
        
        System.out.println("Number of objects created: " + Circles.getNumOfObjects());
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Radius: " + circle3.getRadius());
    }
}
