package Network2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPReceiver implements Runnable{
	
	private Socket sock;
        BufferedReader br ;
        
	
	public TCPReceiver(Socket sock){
		this.sock = sock;	
	}

	@Override
	public void run() {
		try {
                        String tampon;
                        br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
                        //while (  br.readLine()!= null ){
                        System.out.println(br.readLine());
                        //}
                        
                        this.sock.close();
                }
		 catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
