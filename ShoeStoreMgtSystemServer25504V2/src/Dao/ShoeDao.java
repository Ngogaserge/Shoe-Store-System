/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import Model.Shoe;

/**
 *
 * @author Serge
 */
public class ShoeDao {
    public String autoGenerateShoeId() {
    try  {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "select max(s.shoeId) from Shoe s";
        String maxShoeId =(String) session.createQuery(hql).uniqueResult();
        session.close();

        if (maxShoeId == null) {
            return "SH001";
        }

        Integer id = Integer.parseInt(maxShoeId.substring(2));
        id++;
        maxShoeId = String.format("SH%03d", id);

        return maxShoeId;
    } catch (Exception e) {
        e.printStackTrace();
        return "Server Error";
    }
}
    
    public Shoe registerShoe(Shoe shoeObj){
      try {
          Session ss = HibernateUtil.getSessionFactory().openSession();
          Transaction tr = ss.beginTransaction();
          ss.save(shoeObj);
          tr.commit();
          ss.close();
          return shoeObj;
          
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
      
  }
    
    public Shoe updateShoe(Shoe shoeObj){
      try {
          Session ss = HibernateUtil.getSessionFactory().openSession();
          Transaction tr = ss.beginTransaction();
          ss.update(shoeObj);
          tr.commit();
          ss.close();
          return shoeObj;
          
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
      
  }
    public Shoe deleteShoe(Shoe shoeObj){
      try {
          Session ss = HibernateUtil.getSessionFactory().openSession();
          Transaction tr = ss.beginTransaction();
          ss.delete(shoeObj);
          tr.commit();
          ss.close();
          return shoeObj;
          
      } catch (Exception e) {
          e.printStackTrace();
      }
      return null;
      
  }
    
    public Shoe searchShoe(Shoe shoeObj){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            
            Shoe theShoe =(Shoe) ss.get(Shoe.class, shoeObj.getShoeId());
            System.out.println(theShoe);
            ss.close();
            return theShoe;
        } catch (Exception e) {
           
        }
        return null;
    }
    
    public List<Shoe> retrieveShoe(){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Shoe> retrieveShoe = ss.createCriteria(Shoe.class).list();
            ss.close();
            return retrieveShoe;
        } catch (Exception e) {
        }
        return null;
        
    }
}
