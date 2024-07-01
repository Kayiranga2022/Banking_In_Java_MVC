/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.implementation;

import dao.BalanceDao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Balances;
import service.BalancesInterface;

/**
 *
 * @author nesta
 */
public class BalancesImpl  extends UnicastRemoteObject implements BalancesInterface{
    
     public BalancesImpl() throws RemoteException{
        super();
    }
    public BalanceDao dao=new BalanceDao();

    @Override
    public String registerBalances(Balances balances) throws RemoteException {
        return dao.registerBalances(balances);
    }

    @Override
    public String updateBalances(Balances balances) throws RemoteException {
       return dao.updateBalances(balances);
    }

    @Override
    public String deleteBalances(Balances balances) throws RemoteException {
        return dao.deleteBalances(balances);
    }

    @Override
    public List<Balances> getAllBalances() throws RemoteException {
        return dao.allBalances();
    }

    @Override
    public Balances getBalancesByAccno(Balances balances) throws RemoteException {
        return dao.getBalancesByAccno(balances);
    }
    
}
