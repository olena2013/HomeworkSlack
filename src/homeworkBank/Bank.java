package homeworkBank;

public class Bank {
   public SavingAccount openAccount(Customer custom){
     if(custom.getSsn()== true){
       return new SavingAccount(custom.getLastName(),"12345","USD");
     } else {
       return null;
     }
   }














}
