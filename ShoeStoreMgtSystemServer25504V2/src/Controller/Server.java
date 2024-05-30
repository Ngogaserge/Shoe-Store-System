/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Implementation.CustomerImplementation;
import Implementation.EmployeeImplementation;
import Implementation.OrderImplementation;
import Implementation.ShoeImplementation;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Serge
 */
public class Server {
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry thereg = LocateRegistry.createRegistry(6000);
            thereg.rebind("customer", new CustomerImplementation());
            thereg.rebind("employee", new EmployeeImplementation());
            thereg.rebind("order", new OrderImplementation());
            thereg.rebind("shoe", new ShoeImplementation());
            System.out.println("Server is Running on port 6000");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
}
