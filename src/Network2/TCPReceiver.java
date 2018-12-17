package Network2;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;

public class TCPReceiver implements Runnable{
	
	private Socket sock;
	private DataInputStream fluxentrant;
	private File fichier;
	private FileWriter fw;
	
	public TCPReceiver(Socket sock, DataInputStream flux, String fileName){
		this.sock = sock;	
		this.fluxentrant = flux;
		this.fichier = new File(fileName);
		try {
			this.fw = new FileWriter(this.fichier);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			this.fw.write(this.fluxentrant.readUTF());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			this.fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			this.sock.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
