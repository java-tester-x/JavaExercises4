package src.ex4;

public class Circle extends Shape {

    protected  double radius;

    public Circle() {
        super();
        radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        // StringBuilder sb        = new StringBuilder();
        // Formatter     formatter = new java.util.Formatter(sb);
        // formatter.format("A Circle with radius = %d, which is a subclass of %s"
        //                 , radius, super.toString());
        // return sb.toString();
        return String.format("A Circle with radius = %f, which is a subclass of %s"
                            , radius, super.toString());
    }
}