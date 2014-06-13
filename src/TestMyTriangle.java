package src;

public class TestMyTriangle {

    public static void main(String[] args)
    {
        MyTriangle t1 = new MyTriangle(1,1,  3,5,  6,2);
        MyTriangle t2 = new MyTriangle(new MyPoint(1,1), new MyPoint(3,5), new MyPoint(6,2));

        System.out.println("Triangle "+ t1 +" is "+ t1.printType() +" and has perimeter "+t1.getPerimeter());
        System.out.println("Triangle "+ t2 +" is "+ t2.printType() +" and has perimeter "+t2.getPerimeter());
    }
}   