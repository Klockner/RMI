/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidortickettgs;

import interfaces.InterfaceTGS;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author JamilliF
 */

/*Implementa a interface InterfaceTGS*/
class ServidorTGSImplem extends UnicastRemoteObject implements InterfaceTGS {
    
    public ServidorTGSImplem() throws RemoteException {
    }
    
    
}
