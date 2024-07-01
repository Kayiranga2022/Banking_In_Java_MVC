/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author nesta
 */

public class Balances implements Serializable {
   
     private int Account_No;  
      private String FullNames;
       private int Balance;

    public Balances() {
    }

    public Balances(int Account_No) {
        this.Account_No = Account_No;
    }

    public Balances(int Account_No, String FullNames, int Balance) {
        this.Account_No = Account_No;
        this.FullNames = FullNames;
        this.Balance = Balance;
    }

    public int getAccount_No() {
        return Account_No;
    }

    public void setAccount_No(int Account_No) {
        this.Account_No = Account_No;
    }

    public String getFullNames() {
        return FullNames;
    }

    public void setFullNames(String FullNames) {
        this.FullNames = FullNames;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }
       
       
}
