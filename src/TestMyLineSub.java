package src;

public class TestMyLineSub {

    public static void main(String[] args) {
        MyLineSub aLine = new MyLineSub(0, 0, 3, 4);
        System.out.println(aLine);
        System.out.println("Line 1 begin is "+aLine.getBegin());
        System.out.println("Line 1 end is "+aLine.getEnd());        
        System.out.println("Line 1 begin X is "+aLine.getBeginX());
        System.out.println("Line 1 begin Y is "+aLine.getBeginY());
        System.out.println("Line 1 end X is "+aLine.getEndX());
        System.out.println("Line 1 end Y is "+aLine.getEndY());
        System.out.println("Line 1 length is "+aLine.getLength());
        System.out.println("Line 1 gradient is "+aLine.getGradient());
        System.out.println("=====================");

        System.out.println("Change line 1 params...");
        aLine.setBegin(new MyPoint2(1, 1));
        aLine.setEnd(new MyPoint2(4, 5));
        System.out.println("Line 1 begin is "+aLine.getBegin());
        System.out.println("Line 1 end is "+aLine.getEnd());        
        System.out.println("Line 1 length is "+aLine.getLength());
        System.out.println("Line 1 gradient is "+aLine.getGradient());
        System.out.println("=====================");


        MyLineSub aLine2 = new MyLineSub(new MyPoint2(0, 0), new MyPoint2(3, 4));
        System.out.println(aLine2);
        System.out.println("Line 2 begin is "+aLine2.getBegin());
        System.out.println("Line 2 end is "+aLine2.getEnd());        
        System.out.println("Line 2 begin X is "+aLine2.getBeginX());
        System.out.println("Line 2 begin Y is "+aLine2.getBeginY());
        System.out.println("Line 2 end X is "+aLine2.getEndX());
        System.out.println("Line 2 end Y is "+aLine2.getEndY());
        System.out.println("Line 2 length is "+aLine2.getLength());
        System.out.println("Line 2 gradient is "+aLine2.getGradient());
        System.out.println("=====================");

        System.out.println("Change line 2 params...");
        aLine2.setBeginXY(2, 2);
        aLine2.setEndXY(5, 6);
        System.out.println("Line 2 begin is "+aLine2.getBegin());
        System.out.println("Line 2 end is "+aLine2.getEnd());        
        System.out.println("Line 2 length is "+aLine2.getLength());
        System.out.println("Line 2 gradient is "+aLine2.getGradient());
        System.out.println("=====================");
    }

}