
package domain;

import database.AccountDA;
import java.util.ArrayList;


public class Account {
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
class AssetAccount extends Account {
    private double interestRate;
    private double transactionFee;

    public AssetAccount(int accountNumber, int customerID, String accountName, String dateOpened,
                        double interestRate, double transactionFee) {
        super(accountNumber, customerID, accountName, dateOpened);
        this.interestRate = interestRate;
        this.transactionFee = transactionFee;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }
}

class LiabilityAccount extends Account {
    private double interestRate;
    private double monthlyPayment;
    private String paymentDate;

    public LiabilityAccount(int accountNumber, int customerID, String accountName, String dateOpened,
                            double interestRate, double monthlyPayment, String paymentDate) {
        super(accountNumber, customerID, accountName, dateOpened);
        this.interestRate = interestRate;
        this.monthlyPayment = monthlyPayment;
        this.paymentDate = paymentDate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
}


