/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Employee;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Serge
 */
public interface EmployeeService extends Remote{
   
    List<Employee> LoginStatus(Employee emp) throws RemoteException;
    Employee registerEmployee(Employee employeeObj) throws RemoteException;
    Employee updateEmployee(Employee employeeObj) throws RemoteException;
    Employee deleteEmployee(Employee employeeObj) throws RemoteException;
    Employee searchEmployee(Employee employeeObj) throws RemoteException;
    List<Employee> retrieveEmployee() throws RemoteException;
    
    
}
