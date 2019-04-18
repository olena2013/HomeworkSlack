package homeworklesson15;

public class Student {
  private String firstName;
  private String lastName;
  private boolean diploma;

  public Student(String firstName, String lastName, boolean diploma) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.diploma = diploma;
  }

  public String getFirstName() {
    return firstName;
  }
  public String getLastName(){
    return lastName;
  }
  public boolean getDiploma(){
    return diploma;
  }

}

