/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorservicoss;

import interfaces.InterfaceSS;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author JamilliF
 */

/*Implementa a interface InterfaceSS*/
class ServidorSSImplem extends UnicastRemoteObject implements InterfaceSS {
    
    public ServidorSSImplem() throws RemoteException {
    }
    
}
