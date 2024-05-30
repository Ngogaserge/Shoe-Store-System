/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementation;

import Dao.EmployeeDao;
import Model.Employee;
import Service.EmployeeService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Serge
 */
public class EmployeeImplementation extends UnicastRemoteObject implements EmployeeService{
    EmployeeDao dao = new EmployeeDao();

    public EmployeeImplementation() throws RemoteException{
    }

    

    

    @Override
    public Employee registerEmployee(Employee employeeObj) throws RemoteException {
        return dao.registerEmployee(employeeObj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee updateEmployee(Employee employeeObj) throws RemoteException {
        return dao.updateEmployee(employeeObj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee deleteEmployee(Employee employeeObj) throws RemoteException {
        return dao.deleteEmployee(employeeObj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee searchEmployee(Employee employeeObj) throws RemoteException {
        return dao.searchEmployee(employeeObj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> retrieveEmployee() throws RemoteException {
       return dao.retrieveEmployee(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> LoginStatus(Employee emp) throws RemoteException {
        return retrieveEmployee(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
