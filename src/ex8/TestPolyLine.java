package src.ex8;

public class TestPolyLine {

    public static void main(String[] args)
    {
        PolyLine l1 = new PolyLine();
        System.out.println(l1);    // empty
    
        l1.appendPoint(new Point(1, 1));
        l1.appendPoint(2, 2);
        l1.appendPoint(3, 3);
        System.out.println(l1);    // (1,1)(2,2)(3,3)
    }
}