package src;


public class MyLine {
    
    private MyPoint2 begin;    // beginning point
    private MyPoint2 end;      // ending point

    // Constructors
    public MyLine (MyPoint2 begin, MyPoint2 end) {
        this.begin = begin;
        this.end   = end;
    }
    public MyLine (int beginX, int beginY, int endX, int endY) {
        begin = new MyPoint2(beginX, beginY);
        end   = new MyPoint2(endX, endY);
    }

    @Override
    public String toString() {
        return "Line: [ " + begin + ", " + end + " ]";
    }

    public MyPoint2 getBegin() {
        return begin;
    }
    
    public MyPoint2 getEnd() {
        return end;
    }
    
    public void setBegin(MyPoint2 begin) {
        this.begin = begin;
    }
    
    public void setEnd(MyPoint2 end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }
    
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public void setEndXY(int x, int y) {
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