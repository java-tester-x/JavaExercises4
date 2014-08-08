/**
 * Screen Capture
 */

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;
 
/**
 * Using java.awt.Robot to capture a screen shot and saves it
 */
public class RobotScreenCaptureDemo {
   public static void main(String[] args) {
      try {
         // Get the "actual" screen size
         Dimension scr = Toolkit.getDefaultToolkit().getScreenSize();
         System.out.println("(" + scr.width + "," + scr.height + ")");
 
         // Allocate a Robot instance, and do a screen capture
         Robot robot = new Robot();
         Rectangle rect = new Rectangle(0, 0, scr.width, scr.height);
         BufferedImage image = robot.createScreenCapture(rect);
 
         // Save the captured image to file with ImageIO (JDK 1.4)
         ImageIO.write(image, "jpeg", new File("captured.jpg"));
      } catch (AWTException ex) {  // for Robot()
         ex.printStackTrace();
      } catch (IOException ex) {   // for ImageIO.write()
         ex.printStackTrace();
      }
   }
}