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

    @Override
    public String toString() {
        return "Line: ("+getX()+", "+getY()+") - ("
            +  end.getX()+", "+end.getY() +")";
    }

    public MyPoint2 getBegin() {
        return new MyPoint2(getX(), getY());
    }    
    public MyPoint2 getEnd() {
        return end;
    }
    
    public void setBegin(MyPoint2 begin) {
        this.setXY(begin.getX(), begin.getY());
    }    
    public void setEnd(MyPoint2 end) {
        this.end.setXY(end.getX(), end.getY());
    }

    public int getBeginX() {
        return getX();
    }
    public int getBeginY() {
        return getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        setX(x);
    }
    public void setBeginY(int y) {
        setY(y);
    }
    public void setBeginXY(int x, int y) {
        setXY(x, y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }
    public void setEndY(int y) {
        end.setY(y);
    }
    public void setEndXY(int x , int y) {
        end.setXY(x, y);
    }

    public int getLength() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return (int) Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }
}