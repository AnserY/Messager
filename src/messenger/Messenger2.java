/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger;

import Network2.*;
import java.net.InetAddress;

/**
 *
 * @author anser
 */
public class Messenger2 {
    
     public TCPClient Ctcp;
  
     
    public Messenger2(InetAddress adr){
        
        Ctcp = new TCPClient(adr);
        
    }
    
}
