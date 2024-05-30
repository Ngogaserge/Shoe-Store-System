/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Model.Order;

/**
 *
 * @author Serge
 */
public class OrderDao {
    public String autoGenerateOrderId() {
    try  {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "select max(o.orderId) from Order o";
        String maxOrderId =(String) session.createQuery(hql).uniqueResult();
        session.close();

        if (maxOrderId == null) {
            return "OR001";
        }

        Integer id = Integer.parseInt(maxOrderId.substring(2));
        id++;
        maxOrderId = String.format("OR%03d", id);

        return maxOrderId;
    } catch (Exception e) {
        e.printStackTrace();
        return "Server Error";
    }
}
    
    public Order registerOrder(Order orderObj){
      try {
          Session ss = HibernateUtil.getSessionFactory().openSession();
          Transaction tr = ss.beginTransaction();
          ss.save(orderObj);
          tr.commit();
          ss.close();
          return orderObj;
          
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
      
  }
    public Order updateOrder(Order orderObj){
      try {
          Session ss = HibernateUtil.getSessionFactory().openSession();
          Transaction tr = ss.beginTransaction();
          ss.update(orderObj);
          tr.commit();
          ss.close();
          return orderObj;
          
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
      
  }
    
    public Order deleteOrder(Order orderObj){
      try {
          Session ss = HibernateUtil.getSessionFactory().openSession();
          Transaction tr = ss.beginTransaction();
          ss.delete(orderObj);
          tr.commit();
          ss.close();
          return orderObj;
          
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
      
  }
    public Order searchOrder(Order orderObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            
            Order theOrder =(Order) ss.get(Order.class, orderObj.getOrderId());
            
            ss.close();
            return theOrder;
        } catch (Exception e) {
           
        }
        return null;
    }
    
    public List<Order> retrieveOrder(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Order> retrieveOrder = ss.createQuery("SELECT orderObj FROM Order orderObj").list();
            ss.close();
            return retrieveOrder;
        } catch (Exception e) {
        }
        return null;
        
    }
  
}
