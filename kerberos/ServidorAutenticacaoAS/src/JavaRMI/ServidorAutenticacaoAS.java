/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaRMI;

import interfaces.InterfaceAS;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JamilliF
 */
public class ServidorAutenticacaoAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Registry refSN = LocateRegistry.createRegistry(1111);
            ServidorASImplem servImpl = new ServidorASImplem();
            
            refSN.rebind("ServerAS", servImpl);
            
        } catch (RemoteException ex) {
            Logger.getLogger(ServidorAutenticacaoAS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
