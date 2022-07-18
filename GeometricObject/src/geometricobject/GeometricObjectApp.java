package geometricobject;

public class GeometricObjectApp {

    public static void main(String[] args) {
        GeometricObject object1 = new GeometricObject();
        System.out.println(object1.toString());
        
        GeometricObject object2 = new GeometricObject("Black", false);
        System.out.println(object2.toString());
        
        Circle circle1 = new Circle();
        circle1.printCircle();
        
        Circle circle2 = new Circle(7.0);
        circle2.printCircle();
        
        Circle circle3 = new Circle(7.0, "Blue", true);
        circle3.printCircle();
        
        Rectangle rect1 = new Rectangle();
        rect1.printRectangle();
        
        Rectangle rect2 = new Rectangle(7.0, 7.0);
        rect2.printRectangle();
        
        Rectangle rect3 = new Rectangle(7.0, 7.0, "Maroon", true);
        rect3.printRectangle();
        System.out.println("rect3 object");
        System.out.println(rect3.toString());
        
        System.out.println("Bulat object");
        GeometricObject bulat = new Circle(10.0);
        System.out.println(bulat.toString());
        ((Circle)bulat).printCircle();
    }
}
