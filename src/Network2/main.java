/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network2;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author anser
 */
public class main {
    
    
     public static void main(String args[]) throws UnknownHostException{
        
          InetAddress adr = InetAddress.getByName("192.168.1.61");
         
         TCPClient Ctcp = new TCPClient("/home/anser/NetBeansProjects/Messenger/src/Network2/test.txt",adr);
         Thread T1 = new Thread(Ctcp);
         T1.start();
    }
    
}
