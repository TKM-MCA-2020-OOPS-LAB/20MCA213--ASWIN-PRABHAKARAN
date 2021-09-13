import java.awt.*;
import java.applet.*;
import java.awt.Graphics;
import java.awt.event.*;
/*
<applet code="House.class" width=400 height=450></applet>
*/
public class House extends Applet implements MouseListener
{
int a,b;
public void init()
{
addMouseListener(this);
}
public void paint(Graphics gh)
{ int [] x = {170, 280, 300,150};
        int [] y = {100, 100, 150, 150};
        gh.setColor(Color.cyan);
        gh.fillRect(150, 150, 150, 200); //House
        gh.drawRect(200, 200, 50, 150); // Door
        gh.setColor(Color.pink);
        gh.fillRect(200,200,50,150);
        gh.setColor(Color.blue);
        gh.fillPolygon(x,y,4);
        if(a>200 && a<300 && b>200 && b<300)
        {
            gh.setColor(Color.orange);
            gh.fillRect(200, 200, 50, 150);
        }
    }
    public void mouseClicked(MouseEvent e)
    {

    }
    public void mouseEntered(MouseEvent e)
    {

    }

    
    public void mouseExited(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e)
    {
        a=e.getX();
        b=e.getY();
        repaint();

    }
    public void mouseReleased(MouseEvent e)
    {

    }

}