/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Balances;

/**
 *
 * @author nesta
 */
public interface BalancesInterface  extends Remote{
     public String registerBalances(Balances balances) throws RemoteException;
    public String updateBalances(Balances balances) throws RemoteException;
    public String deleteBalances(Balances balances) throws RemoteException;
    public List<Balances> getAllBalances() throws RemoteException;
    public Balances getBalancesByAccno(Balances balances) throws RemoteException;
    
}
