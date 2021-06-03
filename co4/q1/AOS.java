package c04;
import java.util.*;
public class Pckg1 {
	public static void main(String[] args) {
		int ch;
		Scanner j=new Scanner(System.in);
		System.out.println("Choose :\n1.Rectangle \n2.Cirlce\n3.Square\n4.Triangle");
		ch=j.nextInt();
		
		switch(ch)
		{
		case 1:
		rect R=new rect();
		R.input();
		R.area();
		break;
		case 2:
		Circle C=new Circle();
		C.input();
		C.area();
		break;
		case 3:
	    Square S=new Square();
	    S.input();
		S.area();
		break;
		case 4:
		Tri T=new Tri();
		T.input();
		T.area();
		break;
		default:
			System.out.println("enter a valid choice");
	}
	}
}
