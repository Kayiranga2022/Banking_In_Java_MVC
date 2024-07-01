/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Account;

/**
 *
 * @author nesta
 */
public interface AccountInterface extends Remote{
    public String registerAccount(Account account) throws RemoteException;
    public String updateAccount(Account account) throws RemoteException;
    public String deleteAccount(Account account) throws RemoteException;
    public List<Account> getAllAccount() throws RemoteException;
    public Account getAccountByAccno(Account account) throws RemoteException;
    
}
