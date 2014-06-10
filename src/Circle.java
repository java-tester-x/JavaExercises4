package src;

/**
 * A class called circle is designed as shown in the following class diagram. It contains:
 * 
 * 1) Two private instance variables: radius (of type double) and color (of type String),
 *    with default value of 1.0 and "red", respectively.
 * 2) Two overloaded constructors;
 * 3) Two public methods: getRadius() and getArea().
 * 
 * The source codes for Circle is as follows:
 */

public class Circle {
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   
   // 1st constructor, which sets both radius and color to default
   public Circle() {
      this.radius = 1.0;
      this.color  = "red";
   }
   
   // 2nd constructor with given radius, but color default
   public Circle(double radius) {
      this.radius = radius;
      this.color  = "red";
   }

   // Construtor to construct a new instance of Circle with the given radius and color
   public Circle (double radius, String color) {
      this.radius = radius;
      this.color  = color;
   }
   
   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }
   
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }

   // Getter for instance variable color
   public String getColor() {
      return color;
   }

   // Setter for instance variable radius
   public void setRadius(double radius) {
      this.radius = radius;
   }
    
   // Setter for instance variable color
   public void setColor(String color) {
      this.color = color;
   }

   public String toString() {
      return "Circle: radius=" + radius + " color=" + color;
   }
}