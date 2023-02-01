
package domain;

import database.AccountDA;
import java.util.ArrayList;


abstract class Account {
    private int accountNumber;
    private int customerID;   //this is a foreign from customer!!! no solve now
    private String accountName;
    private String dateOpened;
    public Account(int accountNumber, int customerID, String accountName, String dateOpened) {
        this.accountNumber = accountNumber;
        this.customerID = customerID;
        this.accountName = accountName;
        this.dateOpened = dateOpened;
    }
    public void add(){
    AccountDA.add(this);
    }
    public static ArrayList <Account>getAccounts(){
    return AccountDA.getAccounts();}
    public static void initialize(){
    AccountDA.initialize();
    }
    public String toString(){
        return getCustomerID()+"    "+getAccountNumber()+"    "+getAccountName();
        
    }
    
    

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(String dateOpened) {
        this.dateOpened = dateOpened;
    }
    
}





