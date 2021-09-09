import java.applet.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;

public class Shape extends Applet implements ItemListener {

    Choice ch;
    int Select; 
    

    public void init()
    {
        ch = new Choice();
        ch.addItem("SELECT SHAPE");
        ch.addItem("RECTANGLE");
        ch.addItem("SQUARE");
        ch.addItem("CIRCLE");
        ch.addItem("TRIANGLE");
        add(ch);
        ch.addItemListener(this);
    }

 public void itemStateChanged (ItemEvent e)
    {
         
         Select = ch.getSelectedIndex();
         repaint();
    }

 public void paint(Graphics s)
	{
s.setColor(Color.red);  
         super.paint(g);

         if (Select == 1)
         {  
             
             s.drawRect(80, 180, 400, 180);
             s.setColor(Color.orange);
             s.fillRect(80,180,400,180);
         }
         if (Select == 2)
         {
        	 s.drawRect(100,100,200,200);
                 s.setColor(Color.blue);
                 s.fillRect(100,100,200,200);
         }
         if (Select == 3)
         {
             
             s.drawOval(150,150,400,400);
	     s.setColor(Color.yellow);
	     s.fillOval(150,150,400,400);
         }
         if (Select ==4)
         {
             s.drawLine(120, 130, 280, 130);
             s.drawLine(120, 130, 200, 65);
             s.drawLine(200, 65, 280, 130);
         }
	}
}

/* 
<applet code="Shape.class" width="800" height="750" border="8"> 
</applet> 
*/ 