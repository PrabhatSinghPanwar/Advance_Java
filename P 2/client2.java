import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client2 {

public static void main(String[] args) throws Exception {

	Socket s = new Socket("localhost",8080) ;
	DataOutputStream dataWrite = new DataOutputStream(s.getOutputStream()) ;
	DataInputStream dataRead = new DataInputStream(s.getInputStream()) ;

	Scanner sc = new Scanner(System.in) ;

	System.out.println( "Connection is established you can chat now : " ) ;

	String str = "" , str2 = "" ;
	
	while( !str2.equals("bye") ) {
	
		str=sc.nextLine() ;
		dataWrite.writeUTF(str) ;
		dataWrite.flush() ;
		
		str2=dataRead.readUTF() ;	
		System.out.println( "Server says : "+str2 ) ;	
  	}

	dataRead.close() ;
	s.close() ;

    }
}