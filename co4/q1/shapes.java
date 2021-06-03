package c04;
import java.util.*;

interface Shapes {
	void input();
	void area();
	
}
class rect implements Shapes
{
	int l,b;
	double area1;
	public void input() {
		Scanner X =new Scanner(System.in);
		System.out.println("Enter the length and breadth of rectangle:");
		l=X.nextInt();
		b=X.nextInt();
}
	public void area() {
		area1=l*b;
		System.out.println("area of the rectangle is:"+area1);
		
	}
}
class Tri implements Shapes{
	int b,h;
	double area2;
	public void input() {
		Scanner y =new Scanner(System.in);
		System.out.println("Enter the base length and height of triangle:");
		b=y.nextInt();
		h=y.nextInt();
	
}
	public void area() {
		area2=0.5*b*h;
		System.out.println("area of the triangle is:"+area2);
		
	}
}
class Square implements Shapes{
	int s;
	double area3;
	public void input() {
		Scanner z =new Scanner(System.in);
		System.out.println("Enter the side of square");
		s=z.nextInt();
	}
	public void area() {
		area3=s*s;
		System.out.println("area of the square is:"+area3);
		}
}
class Circle implements Shapes{
	int r;
	double area4,pi=3.14;
	public void input() {
		Scanner l =new Scanner(System.in);
		System.out.println("Enter radius of circle");
		r=l.nextInt();
	
	
}
	public void area() {
		area4=pi*r*r;
		System.out.println("area of the circle is:"+area4);
		
	}
}


