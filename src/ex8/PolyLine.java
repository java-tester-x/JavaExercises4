package src.ex8;

import java.util.List;
import java.util.ArrayList;

public class PolyLine {

    private List<Point> points = new ArrayList<Point>();

    public PolyLine() { }   // default constructor

    public PolyLine(List<Point> points) {
        this.points = points;
    }

    public void appendPoint(Point point) {
        points.add(point);
    }

    public void appendPoint(int x, int y) {
        points.add(new Point(x, y));
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Point aPoint : points) {
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(aPoint.toString());
            i++;
        }
        return sb.toString();
    }
}