package domain;

import java.util.ArrayList;

public class BankingSystem {

    public static void main(String[] args) {
        int i;

        Customer.initialize();
        ArrayList<Customer> customer = Customer.getCustomer();
        //customer is an arraylist.
        for (i = 0; i < customer.size(); i++) {
            System.out.println(customer.get(i));//customer is an arraylist,it can use "get"
            //Customer is the class of customer arraylist, so the method get is to return the string 
            //you can modify this in the  Customer class in toString method

        }
        Account.initialize();
        ArrayList<Account> account = Account.getAccounts();
        for (i = 0; i < account.size(); i++) {
            System.out.println(account.get(i));
        }
        Transaction.initialize();
        ArrayList<Transaction>transaction=Transaction
    }

}
