/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author franck
 */
public class main2 extends Thread{
    // Ecoute des demandes de chat
    public static void main( String args[]) throws IOException, InterruptedException{
        
        
        System.out.println("ok");
        TCPServer tcp_serv = new TCPServer();
       
        
        Thread t1 =new Thread(tcp_serv);
        t1.start();
        //main2.sleep(5000);
        // A faire : On attend que le client se connecte avec notify all 
        TimeUnit.SECONDS.sleep(7);
        
       
        Socket sock = tcp_serv.listSock.get(0);
       
        String file = "/Users/franck/Desktop/Messager/src/Network2/test.txt" ; // Récupération des conversations
        InputStream in;
  
        in = new DataInputStream(tcp_serv.listSock.get(0).getInputStream());
        
        TCPReceiver tcp_recv = new TCPReceiver(sock);
        Thread t2 = new Thread(tcp_recv);
        t2.start();
    }
    
}
