import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {

public static void main(String[] args) {

	try{
		Socket s = new Socket("192.168.28.1",8080);
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the msg you want to sent to the server : ");
		String name = sc.nextLine();

		dout.writeUTF(name);

		dout.flush();
		dout.close();
		s.close();
	}catch(Exception e){
		System.out.println(e);}
    }
}		