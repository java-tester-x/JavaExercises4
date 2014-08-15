package src.ex4;

public abstract class Shape {

    protected String    color;
    protected boolean   filled;

    public Shape() {
        color  = "red";
        filled =true;
    }

    public Shape(String color, boolean filled) {
        this.color  = color;
        this.filled = filled;
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();
    abstract public double getPerimeter();

    public String toString() {
        // StringBuilder sb        = new StringBuilder();
        // Formatter     formatter = new java.util.Formatter(sb);
        // formatter.format("A Shape with color of %s and %s", color, (filled ? "filled" : "not filled"));
        // return sb.toString();
        return String.format("A Shape with color of %s and %s", color, (filled ? "filled" : "not filled"));
    }
}