package src.ex5;

public class TestMovableCircle {
    
    public static void main(String[] args)
    {
        Movable m1 = new MovablePoint(5, 6, 10, 10);     // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
           
        Movable m2 = new MovableCircle(2, 1, 2, 2, 20); // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);
    }
}