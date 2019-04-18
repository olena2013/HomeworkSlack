package homeworklesson15;

public class University{

  public Referral verifyStudent(Student student){
    if(student.getDiploma() == true){
      return new Referral(student.getFirstName(),"Biology");
    } else {
      return null;
    }
  }

}
