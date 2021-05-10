package overload;
import java.util.Scanner;
public class area {
	void area(double radius)
	{
		double area = 3.14 *radius*radius;
		System.out.println("Area of circle is "+area);
		
	}
	
	void area(int side)
	{
		int area = side*side;
		System.out.println("Area of square is "+area);
		
	}
	void area(int len , int bre)
	{
		int area = len*bre;
		System.out.println("Area of rectangle is "+area);
		
	}

	public static void main(String args[])
	{
		area obj = new area();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius of circle : ");
		double r = input.nextDouble();
		obj.area(r);
		System.out.println("Enter the side of the square : ");
		int a = input.nextInt();
		obj.area(a);
		System.out.println("Enter length and breadth of rectangle : ");
		int l = input.nextInt();
		int b = input.nextInt();
		input.close();
		obj.area(l, b);
		
	
	}
}
