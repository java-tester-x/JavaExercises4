package src;

public class MyLineSub extends MyPoint2 {
    
    // A line needs two points: begin and end.
    // The begin point is inherited from its superclass Point.
    MyPoint2 end;

    // Constructors
    public MyLineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new MyPoint2(endX, endY);
    }

    public MyLineSub (MyPoint2 begin, MyPoint2 end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    // Inherits methods getX() and getY() from superclass Point
    public String toString() {
        return "Line: ("+super.getX()+", "+super.getY()+") - ("
            +  end.getX()+", "+end.getY() +")";
    }

    public MyPoint2 getBegin() {
        return super;
    }    
    public MyPoint2 getEnd() {
        return end;
    }
    
    public void setBegin(MyPoint2 begin) {
        super.setXY(begin.getX(), begin.getY());
    }    
    public void setEnd(MyPoint2 end) {
        this.end.setXY(end.getX(), end.getY());
    }

    public int getBeginX() {
    }
    public int getBeginY() {
    }
    public int getEndX() {
    }
    public int getEndY() {
    }

    public void setBeginX(...) {
    }
    public void setBeginY(...) {
    }
    public void setBeginXY(...) {
    }
    public void setEndX(...) {
    }
    public void setEndY(...) {
    }
    public void setEndXY(...) {
    }

    public int getLength() {
    }       // Length of the line
    public double getGradient() {
    }  // Gradient in radians
}