package database;

import domain.Account;
import domain.Transaction;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactionDA {

    private static ArrayList<Account> account = Account.getAccounts();
    private static ArrayList<Transaction> transaction = new ArrayList<Transaction>(20);

    public static void add(Transaction t) {
        transaction.add(t);
    }

    public static ArrayList<Transaction> getTransaction() {
        return transaction;
    }

    public static void initialize() {
        Transaction t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12;    //creat 12 objects for 4 accounts for 2 customer
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);

        t1 = new Transaction(1, formattedDate, account.get(0).getAccountNumber(), "buying one book", 10);
        t2 = new Transaction(2, formattedDate, account.get(0).getAccountNumber(), "buying one book", 11);
        t3 = new Transaction(3, formattedDate, account.get(0).getAccountNumber(), "buying one book", 12);
        t4 = new Transaction(4, formattedDate, account.get(1).getAccountNumber(), "buying one book", 13);
        t5 = new Transaction(5, formattedDate, account.get(1).getAccountNumber(), "buying one book", 14);
        t6 = new Transaction(6, formattedDate, account.get(1).getAccountNumber(), "buying one book", 15);
        t7 = new Transaction(7, formattedDate, account.get(2).getAccountNumber(), "buying one book", 16);
        t8 = new Transaction(8, formattedDate, account.get(2).getAccountNumber(), "buying one book", 17);
        t9 = new Transaction(9, formattedDate, account.get(2).getAccountNumber(), "buying one book", 18);
        t10 = new Transaction(10, formattedDate, account.get(3).getAccountNumber(), "buying one book", 19);
        t11 = new Transaction(11, formattedDate, account.get(3).getAccountNumber(), "buying one book", 20);
        t12 = new Transaction(12, formattedDate, account.get(3).getAccountNumber(), "buying one book", 21);

        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        add(t8);
        add(t9);
        add(t10);
        add(t11);
        add(t12);
    }

}
