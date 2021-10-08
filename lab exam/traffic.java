package exam;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.io.*;
public  class Traffic extends Applet implements ActionListener {

	public  void init()
	{
		Label l1;
		l1=new Label("select a color");
		add(l1);
		Choice ch=new Choice();
		ch.add("red");
		ch.add("green");
		ch.add("yellow");
		Button b1,b2,b3;
		b1=new Button("red");
		b2=new Button("green");
		b3=new Button("yellow");
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}

		public  void Graphics(Graphics gh)
		{
			gh.drawRect(200, 250, 360, 270);
			gh.drawOval(100, 120, 60, 70);
			gh.setColor(100,"red");
			gh.fillOval(100, 120, 60, 70);
			gh.drawOval(100, 120, 60, 70);
			gh.setColor(100,"green");
			gh.fillOval(100, 120, 60, 70);
			gh.drawOval(100, 120, 60, 70);
			gh.setColor(100,"yellow");
			gh.fillOval(100, 120, 60, 70);
			
			String s,a;
			int i;
			FileReader f1= new FileReader('C:\Users\19MCA38\Desktop\New folder\numbers.txt');
			if (f1.txt !=null)
			{
				if(i%2==0)
				{
					f1.FileWriter
				}
			}
		}

		@Override
		public void actionPerformed(ActionEvent av) {
			// TODO Auto-generated method stub
			
		}
	
}
