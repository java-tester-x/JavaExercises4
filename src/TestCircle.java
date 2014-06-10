package src;

public class TestCircle {
   public static void main(String[] args) {
      // Declare and allocate an instance of class Circle called c1
      //  with default radius and color
      Circle c1 = new Circle();
      // Use the dot operator to invoke methods of instance c1.
      System.out.println("The circle has radius of " 
         + c1.getRadius() + " and area of " + c1.getArea()
         + " and color of " + c1.getColor());
   
      // Declare and allocate an instance of class circle called c2
      //  with the given radius and default color
      Circle c2 = new Circle(2.0);
      // Use the dot operator to invoke methods of instance c2.
      System.out.println("The circle has radius of " 
         + c2.getRadius() + " and area of " + c2.getArea()
         + " and color of " + c2.getColor());

      // Declare and allocate an instance of class circle called c2
      //  with the given radius and default color
      Circle c3 = new Circle(2.0, "blue");
      // Use the dot operator to invoke methods of instance c2.
      System.out.println("The circle has radius of " 
         + c3.getRadius() + " and area of " + c3.getArea()
         + " and color of " + c3.getColor());


      Circle c4 = new Circle();   // construct an instance of Circle
      c4.setRadius(5.0);          // change radius
      c4.setColor("green");       // change color

      System.out.println("The circle has radius of " 
         + c4.getRadius() + " and area of " + c4.getArea()
         + " and color of " + c4.getColor());

      Circle c5 = new Circle(5.0);
      System.out.println(c5.toString());   // explicit call

      Circle c6 = new Circle(1.2);
      System.out.println(c6);             // println() calls toString() implicitly, same as above
      System.out.println("Operator '+' invokes toString() too: " + c6);  // '+' invokes toString() too
   }
}