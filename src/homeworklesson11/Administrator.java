package homeworklesson11;

public class Administrator {
  public String verifyPerson(String sex, int height) {
    if (sex == "male" && height < 185) {
      return "You can not be a model";
    } else {
      if (sex == "female" && height < 175) {
        return "You can not be a model";
      } else return "Welcome";

    }
  }
}
