
package database;

import domain.Transaction;
import java.util.ArrayList;


public class TransactionDA {
    private static ArrayList<Transaction>transaction =new ArrayList<Transaction>(20);
    public static void add(Transaction t){
    transaction.add(t);
    }
    public static ArrayList<Transaction>getTransaction(){
    return transaction;
    }
    public static void initialize(){
     Transaction t1,t2;
      t1=new Transaction(001,"01-31-23",1001,"buying one book",10);
      add(t1);
    }
}
