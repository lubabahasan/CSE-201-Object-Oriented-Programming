
class Shape {
    String color;
    boolean filled_status;
    
    public Shape(String color, boolean filled_status){
        this.color = color;
        this.filled_status = filled_status;
    }
}

class Circle extends Shape{
    double radius;
    public Circle(String color, boolean filled_status, double radius){
        super(color, filled_status);
        this.radius = radius;
    }
    
    public double calculateArea(){
        return 3.142*radius*radius;
    }
}

class Rectangle extends Shape{
    double width, length;
    public Rectangle(String color, boolean filled_status, double width, double length){
        super(color, filled_status);
        this.width = width;
        this.length = length;
    }
    
    public double calculateArea(){
        return width*length;
    }
}

public class TestShape{
    public static void main(String[] a){
        Shape s1 = new Shape("blue", true);
        Circle c1 = new Circle("pink", false, 4);
        Rectangle r1 = new Rectangle("black", true, 5, 5);
        
        System.out.println("Circle Area : "+c1.calculateArea());
        System.out.println("Rectangle Area : "+r1.calculateArea());
    }
}