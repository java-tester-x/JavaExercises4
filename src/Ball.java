package src;

/**
 * Exercise: Bouncing Balls - Ball and Container Classes
 *
 * A class called Ball is designed as shown in the class diagram.
 * 
 * The Ball class contains the following private instance variables:
 * 
 *     x, y and radius, which represent the ball's center (x, y) co-ordinates and the radius, respectively.
 *     xDelta (Δx) and yDelta (Δy), which represent the displacement (movement) per step, in the x and y 
 *     direction respectively.
 * 
 * The Ball class contains the following public methods:
 * 
 *     A constructor which accepts x, y, radius, speed, and direction as arguments. For user friendliness,
 *     user specifies speed (in pixels per step) and direction (in degrees in the range of (-180°, 180°]).
 *     For the internal operations, the speed and direction are to be converted to (Δx, Δy) in the internal
 *     representation. Note that the y-axis of the Java graphics coordinate system is inverted, i.e., 
 *     the origin (0, 0) is located at the top-left corner.
 *     
 *     ExerciseOOP_BallCoord.png
 * 
 *     Δx = d × cos(θ)
 *     Δy = -d × sin(θ)
 * 
 *     Getter and setter for all the instance variables.
 *     A method move() which move the ball by one step.
 * 
 *     x += Δx
 *     y += Δy
 * 
 *     reflectHorizontal() which reflects the ball horizontally (i.e., hitting a vertical wall)
 * 
 *     Δx = -Δx
 *     Δy no changes
 * 
 *     reflectVertical() (the ball hits a horizontal wall).
 * 
 *     Δx no changes
 *     Δy = -Δy
 * 
 *     toString() which prints the message "Ball at (x, y) of velocity (Δx, Δy)".
 * 
 * Write the Ball class. Also write a test program to test all the methods defined in the class.
 *
 *
 * A class called Container, which represents the enclosing box for the ball, is designed as shown 
 * in the class diagram. It contains:
 * 
 *     Instance variables (x1, y1) and (x2, y2) which denote the top-left and bottom-right corners
 *     of the rectangular box.
 *     
 *     A constructor which accepts (x, y) of the top-left corner, width and height as argument,
 *     and converts them into the internal representation (i.e., x2=x1+width-1). Width and height 
 *     is used in the argument for safer operation (there is no need to check the validity of x2>x1 etc.).
 *     
 *     A toString() method that returns "Container at (x1,y1) to (x2, y2)".
 *     
 *     A boolean method called collidesWith(Ball), which check if the given Ball is outside the bounds 
 *     of the container box. If so, it invokes the Ball's reflectHorizontal() and/or reflectVertical() 
 *     to change the movement direction of the ball, and returns true.
 * 
 *     public boolean collidesWith(Ball ball) {
 *        if (ball.getX() - ball.getRadius() <= this.x1 ||
 *            ball.getX() - ball.getRadius() >= this.x2) {
 *           ball.reflectHorizontal();
 *           return true;
 *        }
 *        ......
 *     }
 * 
 * Use the following statements to test your program:
 * 
 * Ball ball = new Ball(50, 50, 5, 10, 30);
 * Container box = new Container(0, 0, 100, 100);
 * for (int step = 0; step < 100; ++step) {
 *    ball.move();
 *    box.collidesWith(ball);
 *    System.out.println(ball); // manual check the position of the ball
 * }
 */

// import java.util.*;

import java.awt.*;

public class Ball {

    private float   x;
    private float   y;
    private int     radius;
    private float   xDelta;
    private float   yDelta;

    /**
     * [Ball description]
     * @param  x          [description]
     * @param  y          [description]
     * @param  radius     [description]
     * @param  speed      in pixels per step) and direction 
     * @param  direction  in degrees in the range of (-180°, 180°]
     * @return            [description]
     */
    public Ball(int x, int y, int radius, int speed, int direction) {
        this.x      = x;
        this.y      = y;
        this.radius = radius;
        this.xDelta =  speed * (float) Math.cos(Math.toRadians(direction));
        this.yDelta = -speed * (float) Math.sin(Math.toRadians(direction));
    }

    public void setX(int x) {
         this.x = x;
    }
    public int getX() {
        return (int) this.x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return (int) this.y;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return this.radius;
    }

    public int getSpeed() {
        return (int) Math.sqrt(xDelta * xDelta + yDelta * yDelta);
    }
       
    public int getDirection() {
        return (int) Math.toDegrees(Math.atan2(-yDelta, xDelta));
    }

    // --------------------------------------------------------------------------------------------

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // --------------------------------------------------------------------------------------------

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    // --------------------------------------------------------------------------------------------

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    // --------------------------------------------------------------------------------------------

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    public void draw(Graphics g) {
        g.setColor(Color.WHITE); 

        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(new java.awt.geom.Ellipse2D.Double(
          (int)(x - radius), (int)(y - radius)
        , (int)(2 * radius), (int)(2 * radius)
        ));
    }

    // --------------------------------------------------------------------------------------------

    public String toString() {
        return "Ball at ("+ (int) x +", "+ (int) y +") of velocity ("+ getSpeed() +", "+ getDirection() +")";
    }
}