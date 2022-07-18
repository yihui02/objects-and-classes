package geometricobject;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;
    
    public Rectangle() {
        this(0.0, 0.0);
    }
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() { return width; }
    
    public void setWidth(double width) { this.width = width; }
    
    public double getHeight() { return height; }
    
    public void setHeight(double height) { this.height = height; }
    
    public double getArea() { return width * height; }
    
    public double getPerimeter() { return width + height + width + height; }
    
    public String toString() {
        return "Width: " + width + "\nHeight: " + height + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
    
    public void printRectangle() {
        System.out.println(super.toString());
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + String.format("%.1f", getArea()));
        System.out.println("Perimeter: " + String.format("%.1f", getPerimeter()));
    }
}
