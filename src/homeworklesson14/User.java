package homeworklesson14;

public class User {

  private String firstName;
  private String lastName;
  private String dateOfBirth;
  private String city;


  public User(String firstName, String lastName, String dateOfBirth, String city) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.city = city;
  }

  public User(String firstName, String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
  }
}