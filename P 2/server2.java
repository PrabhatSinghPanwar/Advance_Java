import java.io.*;
import java.net.*;
import java.util.Scanner;

public class server2 {

public static void main(String[] args) throws Exception{

	ServerSocket ss = new ServerSocket(8080) ;
	Socket s = ss.accept();

	DataOutputStream dataWrite = new DataOutputStream(s.getOutputStream()) ;
	DataInputStream dataRead = new DataInputStream(s.getInputStream()) ;

	Scanner sc = new Scanner( System.in ) ;

	System.out.println( "Connection is established you can chat now :" ) ;

	String str = "" , str2 = "" ;
	
	while( !str.equals("bye") ) {
		
		str = dataRead.readUTF() ;
		System.out.println( "client says : "+str ) ;	

		str2 = sc.nextLine() ;	
		dataWrite.writeUTF( str2 ) ;
		dataWrite.flush() ;
	
  	}

	dataRead.close() ;
	s.close() ;
	ss.close();

    }
}