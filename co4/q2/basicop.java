package co4q2;
interface bas
{
void add(double a,double b);
void sub(double a,double b);
void mul(double a,double b);
void div(double a,double b);
void rem(double a,double b);
	}
public class Operations implements bas {
	public void add(double a,double b)
	{
		System.out.println("Addition of"  +a+  "and"  +b+  "is :"+(a+b));
	}
	public void sub(double a,double b)
	{
		System.out.println("Subtraction of"  +a+  "and"  +b+ "is :"+(a-b));
	}
	public void mul(double a,double b)
	{
		System.out.println("Multiplication of"  +a+  "and"  +b+  "is :"+(a*b));
	}
	public void div(double a,double b)
	{
		System.out.println("Division of"  +a+  "and"  +b+  "is :"+(a/b));
	}
	public void rem(double a,double b)
	{
		System.out.println("Remainder of" +a+  "and"  +b+  "is :"+(a%b));
	}
}