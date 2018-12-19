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
    // On simule le lancement d'un client
    
    
     public static void main(String args[]) throws UnknownHostException{
        
          InetAddress adr = InetAddress.getByName("127.0.0.1");
         
         TCPClient Ctcp = new TCPClient("/home/anser/NetBeansProjects/Messenger/src/Network2/test.txt",adr);
         Thread T1 = new Thread(Ctcp); // Run l'objet invoqué
         T1.start();
    }

    static void sleep(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
