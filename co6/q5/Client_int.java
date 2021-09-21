package co6;
import java.net.*;
import java.io.*;
public class Client_int {
	public static void main(String args[])throws Exception{
		try {
		  Socket st=new Socket("localhost",2665);
		  PrintWriter p=new PrintWriter(st.getOutputStream(),true);
		  p.println("Client:Intiating connection to server......\n CONNECTED");
		 
	InputStreamReader isr=new InputStreamReader(st.getInputStream());
	BufferedReader b=new BufferedReader(isr);
	String s1=b.readLine();
	System.out.println(" Message is "+s1);
	p.close();
	st.close();
		}
		catch(Exception e) {}
	}
}
