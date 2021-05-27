package q4;
import java.util.*;

class student 
{
	String name ;
	int roll ;
	int comp,maths ;
	public  student()
	{
		Scanner x = new Scanner(System.in);
		System.out.println("Enter Name : ");
		 name = x.next();
		 System.out.println("Enter Roll No : ");
		 roll = x.nextInt();
		 System.out.println("Enter Marks in computer :");
		 comp = x.nextInt();
		 System.out.println("Enter Marks in maths :");
		 maths = x.nextInt();
		
	}
}

class sports extends student
{
	String gr;
	
	public sports()
	{
		Scanner y = new Scanner(System.in);
		System.out.println("Enter grade in sports");
		 gr = y.next();
	}
}

class result extends sports
{
	
	public void display()
	{
		System.out.println("Academic  Details of "+ name);
		System.out.println("____________________________");
		System.out.println("Name : " + name);
		System.out.println("Roll No : " + roll);
		System.out.println("");
		System.out.println("__MARKS__\n");
		System.out.println("computer :" + comp);
		System.out.println("Maths :" + maths);
		System.out.println("");
		System.out.println("__SPORTS GRADE__ \n");
		System.out.println("Score : " + gr);
		System.out.println("");
	}
}
public class std {
	public static void main(String[] args)
	{
		result student = new result();
		student.display();
		
		
	}
}
