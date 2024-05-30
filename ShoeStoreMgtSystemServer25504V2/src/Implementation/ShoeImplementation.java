/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.ShoeDao;
import Model.Shoe;
import Service.ShoeService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Serge
 */
public class ShoeImplementation extends UnicastRemoteObject implements ShoeService{

    public ShoeImplementation() throws RemoteException{
    }
    ShoeDao dao = new ShoeDao();

    @Override
    public String autoGenerateShoeId() throws RemoteException {
        return dao.autoGenerateShoeId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Shoe registerShoe(Shoe shoeObj) throws RemoteException {
        return dao.registerShoe(shoeObj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Shoe updateShoe(Shoe shoeObj) throws RemoteException {
        return dao.updateShoe(shoeObj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Shoe deleteShoe(Shoe shoeObj) throws RemoteException {
        return dao.deleteShoe(shoeObj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Shoe searchShoe(Shoe shoeObj) throws RemoteException {
        return dao.searchShoe(shoeObj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Shoe> retrieveShoe() throws RemoteException {
        return dao.retrieveShoe(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
