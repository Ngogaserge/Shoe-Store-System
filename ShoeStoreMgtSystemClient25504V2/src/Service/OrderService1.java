/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Order;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Serge
 */
public interface OrderService1 extends Remote{
    String autoGenerateOrderId() throws RemoteException;
    Order registerOrder(Order orderObj) throws RemoteException;
    Order updateOrder(Order orderObj) throws RemoteException;
    Order deleteOrder(Order orderObj) throws RemoteException;
    Order searchOrder(Order orderObj) throws RemoteException;
    List<Order> retrieveOrder() throws RemoteException;
    
}
