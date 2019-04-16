package homeworkBank;

public class SavingAccount {
   private String customerName;
   private String number;
   private String currency;
   private int amount;

  public SavingAccount(String customerName, String number, String currency){
    this.customerName = customerName;
    this.number =  number;
    this.currency = currency;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getNumber() {
    return number;
  }

  public String getCurrency() {
    return currency;
  }

  public int getAmount() {
    return amount;
  }
  public void setAmount(int amount){
    this.amount = amount;
  }





}
