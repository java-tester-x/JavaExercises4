package src;

public class TestMyPoint {

    public static void main(String[] args)
    {
        // additional task #1
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);

        // Testing the overloaded method distance()
        System.out.println(p1.distance(p2));    // which version?
        System.out.println(p1.distance(5, 6));  // which version?

        // additional task #2
        MyPoint[] points = new MyPoint[10];
        for (int i= 0; i < points.length; i++ ) {
            points[i] = new MyPoint((i+1), (i+1));
        }

        for (MyPoint p : points) {
            System.out.println("Distance between p1"+ p1 +" and p"+ p +" is "+ p1.distance(p));
        }
    }
}   