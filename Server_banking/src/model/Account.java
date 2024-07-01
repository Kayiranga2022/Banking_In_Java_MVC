/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author nesta
 */
@Entity
public class Account implements Serializable{
     @Id
    private int Account_No;  
      private int Pin;
        private String Account_Type;
       private String Gender;
        private String Address;
        private String FullNames;
             private Date Birth_date;
               private String Nationality;
                private String Phone;
                private int Amount;
                
                //non arguments constructor

    public Account() {
    }

    public Account(int Account_No) {
        this.Account_No = Account_No;
    }

    public Account(int Account_No, int Pin, String Account_Type, String Gender, String Address, String FullNames, Date Birth_date, String Nationality, String Phone, int Amount) {
        this.Account_No = Account_No;
        this.Pin = Pin;
        this.Account_Type = Account_Type;
        this.Gender = Gender;
        this.Address = Address;
        this.FullNames = FullNames;
        this.Birth_date = Birth_date;
        this.Nationality = Nationality;
        this.Phone = Phone;
        this.Amount = Amount;
    }

    public int getAccount_No() {
        return Account_No;
    }

    public void setAccount_No(int Account_No) {
        this.Account_No = Account_No;
    }

    public int getPin() {
        return Pin;
    }

    public void setPin(int Pin) {
        this.Pin = Pin;
    }

    public String getAccount_Type() {
        return Account_Type;
    }

    public void setAccount_Type(String Account_Type) {
        this.Account_Type = Account_Type;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getFullNames() {
        return FullNames;
    }

    public void setFullNames(String FullNames) {
        this.FullNames = FullNames;
    }

    public Date getBirth_date() {
        return Birth_date;
    }

    public void setBirth_date(Date Birth_date) {
        this.Birth_date = Birth_date;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }
                
                
}
