/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messenger;
import java.net.InetAddress;
import network.*;
import model.*;
/**
 *
 * @author anser
 */
public class Messenger  {

   private UDPSender UDPsd;
   private UDPReceiver UDPrc ;
   private Thread T1;
   
   public Messenger(){
       this.UDPsd = new UDPSender(); 
       this.UDPrc = new UDPReceiver();
       this.T1 = new Thread(UDPrc);
       this.T1.start();
       
   }
    
    public void Send (InetAddress adr,String msg,String dst , String src){
           UDPsd.sendMessageNormal(adr,msg,src,dst);
        }

    public UDPReceiver getUDPrc() {
        return this.UDPrc;

    }
    
  
    
}
