package th.ac.kmitl.atm;

/**
 * A bank customer with a checking and a savings account.
 */
public class Customer {

   private int id;
   private String name;
   private int pin;
   private BankAccount account;

   /**
    * Constructs a customer with a given number and PIN.
    * @param id the customer number
    * @param name the customer name
    * @param pin the personal identification number
    */
   public Customer(int id, String name, int pin) {
      this(id, name, pin, 0);
   }


   public Customer(int id, String name, int pin, double balance) {
      this.id = id;
      this.name = name;
      this.pin = pin;
      this.account = new BankAccount(id, name, balance);
   }


   public boolean checkPin(int inputPin) {
      return pin == inputPin;
   }

   public String getName() {
      return name;
   }

   public int getId() {
      return id;
   }

   public BankAccount getAccount() {
      return account;
   }
   public void setName(String name) { this.name = name;}
}
