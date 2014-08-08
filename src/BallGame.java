package src;

import java.util.Formatter;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;


public class BallGame extends JFrame {

    // public static final int CANVAS_WIDTH  = 800;
    // public static final int CANVAS_HEIGHT = 600;
    
    private String title      = "Ball Game";
    
    private int canvasWidth   = 800;
    private int canvasHeight  = 600;

    private static final int UPDATE_RATE = 30; // Number of refresh per second

    private DrawCanvas canvas;
    private Ball ball;
    private Ball ball2;
    private BallContainer box;

    public BallGame() {
        canvas = new DrawCanvas();  // Construct a drawing canvas (a JPanel)
        canvas.setPreferredSize(new Dimension(canvasWidth, canvasHeight));

        // Container cp = getContentPane();
        // cp.setLayout(new BorderLayout());
        // cp.add(canvas, BorderLayout.CENTER);
        setContentPane(canvas);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();  // pack all the components in this JFrame
        setTitle(title);
        setVisible(true);  // show this JFrame

        initGame();
    }


    public void initGame()
    {
        ball  = new Ball(50, 50, 10, 5, 30);
        ball2 = new Ball(50, 50, 30, 15, 60);
        box   = new BallContainer(0, 0, canvasWidth, canvasHeight);

        // Handling window resize.
        canvas.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Component c   = (Component)e.getSource();
                Dimension dim = c.getSize();
                canvasWidth   = dim.width;
                canvasHeight  = dim.height;
                // Adjust the bounds of the container to fill the window
                box.set(0, 0, canvasWidth, canvasHeight);
            }
        });

        // Start the ball bouncing (in its own thread)
        Thread gameThread = new Thread() {
            public void run()
            {
                while (true)
                {
                    box.collidesWith(ball);
                    ball.move();
                    
                    box.collidesWith(ball2);
                    ball2.move();
                    
                    // Refresh the display
                    repaint(); // Callback paintComponent()
                    
                    // Delay for timing control and give other threads a chance
                    try {
                        Thread.sleep(1000 / UPDATE_RATE);  // milliseconds
                    } catch (InterruptedException ex) { }
                }
            }
        };
        gameThread.start();  // Callback run()        
    }


    /**
    *  Inner class DrawCanvas (extends JPanel) used for custom graphics drawing.
    */
    class DrawCanvas extends JPanel {
        @Override
        public void paintComponent(Graphics g) {  // invoke via repaint()
            super.paintComponent(g); 

            setBackground(Color.LIGHT_GRAY);
            g.setColor(Color.WHITE); 

            ball.draw(g);
            ball2.draw(g);

            // Graphics2D g2d = (Graphics2D) g;
            // g2d.drawString(ball.toString(), ball.getX()+2*ball.getRadius(), ball.getY());
        }

        @Override
        public Dimension getPreferredSize() {
            return (new Dimension(canvasWidth, canvasHeight));
        }
    }    


    public static void main(String[] args) {
        // Run GUI codes in the Event-Dispatching thread for thread safety
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BallGame(); // Let the constructor do the job
            }
        });
    }

}
