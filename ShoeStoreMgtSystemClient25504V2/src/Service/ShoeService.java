/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Shoe;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Serge
 */
public interface ShoeService extends Remote{
    String autoGenerateShoeId() throws RemoteException;
    Shoe registerShoe(Shoe shoeObj) throws RemoteException;
    Shoe updateShoe(Shoe shoeObj) throws RemoteException;
    Shoe deleteShoe(Shoe shoeObj) throws RemoteException;
    Shoe searchShoe(Shoe shoeObj) throws RemoteException;
    List<Shoe> retrieveShoe() throws RemoteException;
    
}
