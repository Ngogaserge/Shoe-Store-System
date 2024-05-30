/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Customer;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Serge
 */
public interface CustomerService extends Remote{
    String autoGenerateCustomerId() throws RemoteException;
    Customer registerCustomer(Customer customerObj) throws RemoteException;
    Customer updateCustomer(Customer customerObj) throws RemoteException;
    Customer deleteCustomer(Customer customerObj) throws RemoteException;
    Customer searchCustomer(Customer customerObj) throws RemoteException;
    List<Customer> retrieveCustomer() throws RemoteException;
    
    
}
