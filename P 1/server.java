import java.io.*;
import java.net.*;

public class server {

public static void main(String[] args) {

	try{
		ServerSocket ss = new ServerSocket(8080);
		Socket s=ss.accept();							//established connection
		DataInputStream dis = new DataInputStream(s.getInputStream());
		
		String str = (String)dis.readUTF();
		
		System.out.println("The msg from the client is :  \n"+str);

		ss.close();

	}catch(Exception e){
		System.out.println(e);}
    }
}