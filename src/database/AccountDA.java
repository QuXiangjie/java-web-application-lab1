
package database;

import domain.Account;
import java.util.ArrayList;

public class AccountDA {
    private static ArrayList <Account> account=new ArrayList<Account>(20);
    
    public static void add(Account a){
    account.add(a);
    }
    public static ArrayList<Account> getAccounts(){
    return account;
    }
    public static void initialize(){
     Account a1,a2;
     a1=new Account(10001,1001,"1-ac","1-31-23");
     a2=new Account(10002,1001,"2-ac","1-31-23");
     add(a1);
     add(a2);
     
    }
}
