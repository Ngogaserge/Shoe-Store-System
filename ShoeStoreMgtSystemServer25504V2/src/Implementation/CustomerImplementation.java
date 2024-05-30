/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.CustomerDao;
import Model.Customer;
import Service.CustomerService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Serge
 */
public class CustomerImplementation extends UnicastRemoteObject implements CustomerService{
    CustomerDao dao = new CustomerDao();

    public CustomerImplementation() throws RemoteException{
    }

    @Override
    public String autoGenerateCustomerId() throws RemoteException {
        return dao.autoGenerateCustomerId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer registerCustomer(Customer customerObj) throws RemoteException {
        return dao.registerCustomer(customerObj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer updateCustomer(Customer customerObj) throws RemoteException {
        return dao.updateCustomer(customerObj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer deleteCustomer(Customer customerObj) throws RemoteException {
        return dao.deleteCustomer(customerObj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer searchCustomer(Customer customerObj) throws RemoteException {
        return dao.searchCustomer(customerObj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> retrieveCustomer() throws RemoteException {
        return dao.retrieveCustomer(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
