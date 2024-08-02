package p.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPClient {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("보낼메세지 : ");
		String msg = sc.nextLine(); 
		
		InetAddress inet;
		int port = 4000;
		
		try (DatagramSocket dsoc = new DatagramSocket();){
				inet = InetAddress.getByName("192.168.30.24");

				
				//전송할 데이터 생성 DatagramPacket(전송할 데이터의 byte배열, 전송할 데이터의 길이, ip정보를 담은
				DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length, inet, port);
				dsoc.send(dp);
				
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
		