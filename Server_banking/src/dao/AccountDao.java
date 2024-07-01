/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Account;
import org.hibernate.*;

/**
 *
 * @author nesta
 */
public class AccountDao {
    
    public String registerAccount(Account account){
        
        //create-session
        Session ss= HibernateUtil.getSessionFactory().openSession();
        //create-transaction
        Transaction tr= ss.beginTransaction();
        //save citizen
        //citizen.setIsVaccinated(false);
        ss.save(account);
        tr.commit();
        ss.close();

return "Account Created Successfully";        
    }
     public String updateAccount(Account account){
        
        //create-session
        Session ss= HibernateUtil.getSessionFactory().openSession();
        //create-transaction
        Transaction tr= ss.beginTransaction();
        //save citizen
        //citizen.setIsVaccinated(false);
        
        ss.update(account);
        tr.commit();
        ss.close();

return "Account Updated Successfully";        
    }
     
      public String deleteAccount(Account account){
        
        //create-session
        Session ss= HibernateUtil.getSessionFactory().openSession();
        //create-transaction
        Transaction tr= ss.beginTransaction();
        //save citizen
        //citizen.setIsVaccinated(false);
        ss.delete(account);
        tr.commit();
        ss.close();

return "Account Deleted Successfully";        
    }
      
      //read data
      
       public List<Account> allAccount(){
       //create-session
        Session ss= HibernateUtil.getSessionFactory().openSession();
        List<Account> accountsList = ss.createQuery(" select acc from Account acc").list();
        ss.close();
        return accountsList; 
      }
    //search account by acc no
      
      public Account getAccountByAccno (Account account){
       //create-session
        Session ss= HibernateUtil.getSessionFactory().openSession();
        Account acc = (Account)ss.get(Account.class, account.getAccount_No());
        ss.close();
        return acc;
      }
}
