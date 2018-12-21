/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network2;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

import model.*;
/**
 *
 * @author anser
 */
public class main {
    // On simule le lancement d'un client
    
    
     public static void main(String args[]) throws UnknownHostException, SocketException{
        
         /* InetAddress adr = InetAddress.getByName("192.168.1.61");
          TCPClient Ctcp = new TCPClient(adr);
          MsgTxt mes = new MsgTxt("oui","moi","lui"); 
          Ctcp.sendMessage(mes);*/
         
     /*    Enumeration<NetworkInterface> i = NetworkInterface.getNetworkInterfaces();
       
        while(i.hasMoreElements())
{
    NetworkInterface n = (NetworkInterface) i.nextElement();
    Enumeration ee = n.getInetAddresses();
    while (ee.hasMoreElements())
    {
        InetAddress k = (InetAddress) ee.nextElement();
        System.out.println(k.getHostAddress());
    }*/
        }


}


    

