
package database;

import domain.Customer;
import java.util.ArrayList;


public class CustomerDA {
   private static ArrayList <Customer> customer=new ArrayList <Customer>(10);
           //static, everything in the daclass should be class level
   //customer is the name of arraylist
   
   public static void add(Customer c){
     customer.add(c);
   }
   
   public static ArrayList<Customer> getCustomers(){
      return customer;
   }
   public static void initialize(){
   //set up inital instance into the table
      Customer c;
      c=new Customer();
      c.setCustomerID(1001);
      c.setFirstName("XIANGJIE" );
      c.setLastName("QU");
      c.setPhoneNum(5551312);
      add(c);
      
   }
}
