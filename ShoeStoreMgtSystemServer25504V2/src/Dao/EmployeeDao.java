/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Model.Employee;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Serge
 */
public class EmployeeDao {
   private static SessionFactory factory;

//    static {
//        factory = new Configuration().configure().buildSessionFactory();
//    }

    public List<Employee> loginStatus(Employee emp) {
        

        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = ss.createCriteria(Employee.class);
            criteria.add(Restrictions.eq("username", emp.getUsername()));
            criteria.add(Restrictions.eq("password", emp.getPassword()));
            List<Employee> foundAccount = criteria.list();
            ss.close();
            return foundAccount;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       return null;
    
    }

   
      
  public Employee registerEmployee(Employee employeeObj){
      try {
          Session ss = HibernateUtil.getSessionFactory().openSession();
          Transaction tr = ss.beginTransaction();
          ss.save(employeeObj);
          tr.commit();
          ss.close();
          return employeeObj;
          
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
      
  }
  
  public Employee updateEmployee(Employee employeeObj){
      try {
          Session ss = HibernateUtil.getSessionFactory().openSession();
          Transaction tr = ss.beginTransaction();
          ss.update(employeeObj);
          tr.commit();
          ss.close();
          return employeeObj;
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
  }
  
  public Employee deleteEmployee(Employee employeeObj){
      try {
          Session ss = HibernateUtil.getSessionFactory().openSession();
          Transaction tr = ss.beginTransaction();
          ss.delete(employeeObj);
          tr.commit();
          ss.close();
          return employeeObj;
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
  }
  
  public Employee searchEmployee(Employee employeeObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            
            Employee theEmployee =(Employee) ss.get(Employee.class, employeeObj.getEmployeeId());
            
            ss.close();
            return theEmployee;
        } catch (Exception e) {
           
        }
        return null;
    }
  
  public List<Employee> retrieveEmployee(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Employee> retrieveEmployee = ss.createQuery("SELECT employeeObj FROM Employee employeeObj").list();
            ss.close();
            return retrieveEmployee;
        } catch (Exception e) {
        }
        return null;
        
    }
  
  
  
  
}
