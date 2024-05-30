/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.OrderDao;
import Model.Order;
import Service.OrderService1;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Serge
 */
public class OrderImplementation extends UnicastRemoteObject implements OrderService1{

    public OrderImplementation() throws RemoteException{
    }
    OrderDao dao = new OrderDao();

    @Override
    public String autoGenerateOrderId() throws RemoteException {
        return dao.autoGenerateOrderId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order registerOrder(Order orderObj) throws RemoteException {
        return dao.registerOrder(orderObj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order updateOrder(Order orderObj) throws RemoteException {
        return dao.updateOrder(orderObj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order deleteOrder(Order orderObj) throws RemoteException {
        return dao.deleteOrder(orderObj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order searchOrder(Order orderObj) throws RemoteException {
        return dao.searchOrder(orderObj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Order> retrieveOrder() throws RemoteException {
        return dao.retrieveOrder(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
