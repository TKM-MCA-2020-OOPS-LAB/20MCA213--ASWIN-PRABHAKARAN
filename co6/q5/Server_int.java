package co6;
import java.net.*;
import java.io.*;
public class Server_int {
	public static void main(String args[])throws Exception{
		try {
	        ServerSocket s=new ServerSocket(2665);
	        System.out.println("Server is waiting for the client..!!");
	        Socket sk=s.accept();
	        System.out.println("Connection established...!!");
	     InputStreamReader isr=new InputStreamReader(sk.getInputStream());
	     BufferedReader br=new BufferedReader(isr);
	        String st=br.readLine();
	System.out.println("Message is"+st);
	PrintWriter pw=new PrintWriter(sk.getOutputStream(),true);
	pw.println("Server: Connection Established!!, Welcome ");
	pw.close();
	 }
	   catch(Exception e) {}
	 }
}
