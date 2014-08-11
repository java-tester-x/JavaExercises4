package src;


public class TestShapes {

    public static void main(String[] args) {
        Circle      c1 = new Circle();
        Rectangle   r1 = new Rectangle();
        Square      s1 = new Square();
        System.out.println(c1);
        System.out.println("Circle Area is "+c1.getArea()+"\nCircle perimeter is "+c1.getPerimeter());
        System.out.println(r1);
        System.out.println("Rectangle Area is "+r1.getArea()+"\nRectangle perimeter is "+r1.getPerimeter());
        System.out.println(s1);
        System.out.println("Square Area is "+s1.getArea()+"\nSquare perimeter is "+s1.getPerimeter());
        System.out.println();

        Circle      c2 = new Circle(15);
        Rectangle   r2 = new Rectangle(15, 40);
        Square      s2 = new Square(20);
        System.out.println(c2);
        System.out.println("Circle Area is "+c2.getArea()+"\nCircle perimeter is "+c2.getPerimeter());
        System.out.println(r2);
        System.out.println("Rectangle Area is "+r2.getArea()+"\nRectangle perimeter is "+r2.getPerimeter());
        System.out.println(s2);
        System.out.println("Square Area is "+s2.getArea()+"\nSquare perimeter is "+s2.getPerimeter());
        System.out.println();

        Circle      c3 = new Circle(15, "green", false);
        Rectangle   r3 = new Rectangle(15, 40, "green", false);
        Square      s3 = new Square(20, "green", false);
        System.out.println(c3);
        System.out.println("Circle Area is "+c3.getArea()+"\nCircle perimeter is "+c3.getPerimeter());
        System.out.println(r3);
        System.out.println("Rectangle Area is "+r3.getArea()+"\nRectangle perimeter is "+r3.getPerimeter());
        System.out.println(s3);
        System.out.println("Square Area is "+s3.getArea()+"\nSquare perimeter is "+s3.getPerimeter());
        System.out.println();
    }
}