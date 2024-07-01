/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import dao.AccountDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Account;
import service.AccountInterface;

/**
 *
 * @author nesta
 */
public class AccountImpl extends UnicastRemoteObject implements AccountInterface{
    
    public AccountImpl() throws RemoteException{
        super();
    }
    public AccountDao dao= new AccountDao();

    @Override
    public String registerAccount(Account account) throws RemoteException {
       return dao.registerAccount(account);
    }

    @Override
    public String updateAccount(Account account) throws RemoteException {
        return dao.updateAccount(account);
    }

    @Override
    public String deleteAccount(Account account) throws RemoteException {
        return dao.deleteAccount(account);
    }

    @Override
    public List<Account> getAllAccount() throws RemoteException {
        return dao.allAccount();
    }

    @Override
    public Account getAccountByAccno(Account account) throws RemoteException {
        return dao.getAccountByAccno(account);
    }
    
}
