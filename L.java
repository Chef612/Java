import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class L extends Applet {

final int radius=25;
 public void paint(Graphics g) {

  int xPoints[] = {110,180,30,110};
  int yPoints[] = {30,100,100,30};

  g.setColor(Color.RED);
  g.fillPolygon(xPoints, yPoints, 4);

  g.setColor(Color.BLUE);
  setBackground( Color.lightGray );
      g.drawOval( (500/2 - radius), (400/2 - radius), radius*2, radius*2 );

g. drawRect(100,100,80,150);
g. drawRect(40,100,50,50);
 }
}