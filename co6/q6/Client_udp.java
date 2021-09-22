package co6;
import java.io.*;
import java.net.*;
public class Client_udp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 DatagramSocket client= new DatagramSocket();
	        InetAddress add=InetAddress.getByName("localhost");
	        String st ="Ping from Client!!!";
	        byte[] bufBytes = st.getBytes();
	        DatagramPacket datagramPacket=new DatagramPacket(bufBytes,bufBytes.length,add,4220);
	        client.send(datagramPacket);
	        client.close();
	}

}
