package homeworkBank;

public class Main {

  public static void main(String[] args) {
    Bank bank = new Bank();

    Customer custom1 = new Customer("Ivan", "Ivanov", true);
    SavingAccount account1 = bank.openAccount(custom1);
    String name = account1.getCustomerName();
    System.out.println(name);

    System.out.println(account1.getNumber());
    System.out.println(account1.getCurrency());

    account1.setAmount(100);
    int amount = account1.getAmount();
    System.out.println(amount);

    


  }
}
