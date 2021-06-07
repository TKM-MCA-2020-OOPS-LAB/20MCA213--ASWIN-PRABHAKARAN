package co4q2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		double a,b;
		Operations op=new Operations();
		System.out.println("Enter two numbers:");
		Scanner j=new Scanner(System.in);
		a=j.nextDouble();
		b=j.nextDouble();
		op.add(a,b);
		op.sub(a,b);
		op.mul(a,b);
		op.div(a,b);
		op.rem(a,b);

	}

}
