package homeworkBank;

public class Customer {
  private String firstName;
  private String lastName;
  private boolean ssn;

  public Customer(String firstName, String lastName, boolean ssn) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.ssn = ssn;
  }
  public String getFirstName(){
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public boolean getSsn() {
    return ssn;
  }
}
