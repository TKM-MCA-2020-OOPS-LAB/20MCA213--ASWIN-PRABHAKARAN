package q4;
import java.util.*;
interface shapes    
{       
    public void area();
	public void perimeter();
	Scanner a=new Scanner(System.in);   
 }    

class rect implements shapes   
{    
	int l,b;
	public rect()
	{
		System.out.println("Enter length and breath of Rectangle");
		l=a.nextInt();
		b=a.nextInt();
	}
	public void area()
	{
		System.out.println("Area of Rectangle is "+(l*b));
	}
	public void perimeter()
	{
		System.out.println("Perimeter of Rectangle is "+2*(l+b));
	}   
}    

class circ implements shapes    
{    
	int rad;
    double pi = 3.14; 
public circ()
{
	System.out.println("Enter the radius");
	rad=a.nextInt();
}

public void area()
{
     System.out.println("Area of circle is :"+(pi*rad*rad));
}

public void perimeter()
{
	  System.out.println("perimeter of circle is :"+(2*pi*rad));
}  
}    

public class Interface {

	public static void main(String[] args) {
		int ch;
		Scanner b=new Scanner(System.in);
		System.out.println("Choose :\n1.Cirlce \n2.Rectangle");
		ch=b.nextInt();
		
		switch(ch)
		{
		case 1: circ c = new circ();
				c.area();
				c.perimeter();
		       break;
		case 2: rect r=new rect();
		r.area();
		r.perimeter();
		break;
       }

	}

}
