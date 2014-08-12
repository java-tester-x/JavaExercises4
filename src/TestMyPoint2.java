package src;

public class TestMyPoint2 {

    public static void main(String[] args) {
        MyPoint2 p1 = new MyPoint2(10, 20);
        System.out.println("Now: "+p1);

        // Try setting p1 to (100, 10).
        p1.setXY(100, 10);
        System.out.println("Now: "+p1);
   }
}