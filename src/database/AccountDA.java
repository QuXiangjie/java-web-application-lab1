package database;

import domain.Account;
import domain.Customer;
import java.util.ArrayList;

public class AccountDA {

    private static ArrayList<Account> account = new ArrayList<Account>(20);
    private static ArrayList<Customer> customer = Customer.getCustomer();

    public static void add(Account a) {
        account.add(a);
    }

    public static ArrayList<Account> getAccounts() {
        return account;
    }

    public static void initialize() {
        Account a1, a2, a3, a4;
        a1 = new Account(10001, customer.get(0).getCustomerID(), "1-1-ac", "1-31-23");
        a2 = new Account(10002, customer.get(0).getCustomerID(), "1-2-ac", "1-31-23");
        a3 = new Account(10003, customer.get(1).getCustomerID(), "2-1-ac", "1-31-23");
        a4 = new Account(10004, customer.get(1).getCustomerID(), "2-2-ac", "1-31-23");
        add(a1);
        add(a2);
        add(a3);
        add(a4);

    }
}
