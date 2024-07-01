/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Balances;
import org.hibernate.*;

/**
 *
 * @author nesta
 */
public class BalanceDao {
    
    public String registerBalances(Balances balances){
        
        //create-session
        Session ss= HibernateUtil.getSessionFactory().openSession();
        //create-transaction
        Transaction tr= ss.beginTransaction();
        //save citizen
        //citizen.setIsVaccinated(false);
        ss.save(balances);
        tr.commit();
        ss.close();

return "Balance inserted Successfully";        
    }
     public String updateBalances(Balances balances){
        
        //create-session
        Session ss= HibernateUtil.getSessionFactory().openSession();
        //create-transaction
        Transaction tr= ss.beginTransaction();
        //save citizen
        //citizen.setIsVaccinated(false);
        ss.update(balances);
        tr.commit();
        ss.close();

return "Balance Updated Successfully";        
    }
    
      public String deleteBalances(Balances balances){
        
        //create-session
        Session ss= HibernateUtil.getSessionFactory().openSession();
        //create-transaction
        Transaction tr= ss.beginTransaction();
        //save citizen
        //citizen.setIsVaccinated(false);
        ss.delete(balances);
        tr.commit();
        ss.close();

return "Balance deleted Successfully";        
    }
       //read data
      
       public List<Balances> allBalances(){
       //create-session
        Session ss= HibernateUtil.getSessionFactory().openSession();
        List<Balances> balancesList = ss.createQuery(" select bal from Balances bal").list();
        ss.close();
        return balancesList; 
      }
       
       //search balance by acc no
      
      public Balances getBalancesByAccno (Balances balances){
       //create-session
        Session ss= HibernateUtil.getSessionFactory().openSession();
        Balances bal = (Balances)ss.get(Balances.class, balances.getAccount_No());
        ss.close();
        return bal;
      }
}
