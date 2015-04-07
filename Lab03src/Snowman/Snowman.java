//********************************************************************
//  Snowman.java       
//
//  20123426 √÷¡¯º∫
//********************************************************************

import java.applet.Applet;
import java.awt.*;

// show how to draw Snowman
public class Snowman extends Applet
{
   // draw Snowman step by step
   public void paint(Graphics page)
   {
      page.setColor(Color.green);
      page.fillRect(50,50,100,100);
      page.setColor(Color.red);
      page.fillOval(60,60,80,80);
   }
}
