
package controller;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import service.implementation.AccountImpl;
import service.implementation.BalancesImpl;


/**
 *
 * @author nesta
 */
public class Server {
     
    private AccountImpl accountImpl;
   private BalancesImpl balancesImpl;
    
    public Server() throws RemoteException{
     
        this.accountImpl= new AccountImpl();
        this.balancesImpl= new BalancesImpl();
    }
    public static void main(String[] args){
        try {
            System.setProperty("java.rmi.Server.hostname", "127.0.0.1");
            Registry registry = LocateRegistry.createRegistry(6000);
            
            registry.rebind("account",new AccountImpl());
            registry.rebind("balances",new BalancesImpl());
            
            //registry.rebind("citizen", new Server().citizenImpl);
            //registry.rebind("vaccine", new Server().vaccineImpl);
            System.out.println("Server Is Running On Port 6000");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
       
    }
}
