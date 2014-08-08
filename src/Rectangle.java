package src;

public class Rectangle extends Shape {
    
    private double width    = 1.0;
    private double length   = 1.0;


    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        super();
        this.width  = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this(width, length);
        setColor(color);
        setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width+length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="+width
             + " and length="+length+", which is a subclass of "+super.toString();
    }
}