/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Model.Customer;

/**
 *
 * @author Serge
 */
public class CustomerDao {
   public String autoGenerateCustomerId() {
    try  {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "select max(c.customerId) from Customer c";
        String maxCustomerId =(String) session.createQuery(hql).uniqueResult();
        session.close();

        if (maxCustomerId == null) {
            return "CU001";
        }

        Integer id = Integer.parseInt(maxCustomerId.substring(2));
        id++;
        maxCustomerId = String.format("CU%03d", id);

        return maxCustomerId;
    } catch (Exception e) {
        e.printStackTrace();
        return "Server Error";
    }
}
   
   public Customer registerCustomer(Customer customerObj){
      try {
          Session ss = HibernateUtil.getSessionFactory().openSession();
          Transaction tr = ss.beginTransaction();
          ss.save(customerObj);
          tr.commit();
          ss.close();
          return customerObj;
          
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
      
  }
   
   public Customer updateCustomer(Customer customerObj){
      try {
          Session ss = HibernateUtil.getSessionFactory().openSession();
          Transaction tr = ss.beginTransaction();
          ss.update(customerObj);
          tr.commit();
          ss.close();
          return customerObj;
          
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
      
  }
   
   public Customer deleteCustomer(Customer customerObj){
      try {
          Session ss = HibernateUtil.getSessionFactory().openSession();
          Transaction tr = ss.beginTransaction();
          ss.delete(customerObj);
          tr.commit();
          ss.close();
          return customerObj;
          
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
      
  }
   
   public Customer searchCustomer(Customer customerObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            
            Customer theCustomer =(Customer) ss.get(Customer.class, customerObj.getCustomerId());
            
            ss.close();
            return theCustomer;
        } catch (Exception e) {
           
        }
        return null;
    }
   
   public List<Customer> retrieveCustomer(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Customer> retrieveCustomer = ss.createQuery("SELECT customerObj FROM Customer customerObj").list();
            ss.close();
            return retrieveCustomer;
        } catch (Exception e) {
        }
        return null;
        
    }
   
   
   
  
}
