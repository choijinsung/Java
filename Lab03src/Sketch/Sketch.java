import java.applet.Applet;
import java.awt.*;

// Testing various drawing routines.
public class Sketch extends Applet {

   // Draws some simple figures.
   public void paint() {

      page.drawString("Testing some shapes", 30, 30);

      page.drawLine(30, 60, 50, 60);
      page.drawLine(30, 70, 60, 70);

      page.drawOval(90, 50, 20, 20);
      page.drawOval(120, 50, 40, 20);

   } // method paint

} // class Sketch

