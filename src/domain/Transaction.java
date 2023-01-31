package domain;

public class Transaction {

    private int transactionID;
    private String transactionDate;
    private int accountNumber;   //this is a foreign from customer!!! no solve now
    private String description;
    private int transactionAmount;

    public Transaction(int transactionID, String transactionDate, int accountNumber, String description, int transactionAmount) {
        this.accountNumber = accountNumber;
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
        this.accountNumber = accountNumber;   //this is a foreign from customer!!! no solve now
        this.description = description;
        this.transactionAmount = transactionAmount;
    }
     public void add(){
      CustomerDA.add(this);
      
    };
    public static ArrayList<Customer>getCustomer(){
       return CustomerDA.getCustomers();
    }
    public static void initialize(){
           CustomerDA.initialize();
    }
    public String toString(){
        
    return getCustomerID()+"    "+getFirstName();
            }
    

    public int getTransactionID() {
        return transactionID;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
    

}
