package homeworklesson15;

import java.lang.reflect.Array;

public class Main {
  public static void main(String[] args) {

    Student student1 = new Student("Ivan", "Ivanov", true);
    Student student2 = new Student("Petr", "Petrov", true);
    Student student3 = new Student("John", "Smith", false);

    University univer = new University();
    Referral referral1 = univer.verifyStudent(student1);
    Referral referral2 = univer.verifyStudent(student2);
    Referral referral3 = univer.verifyStudent(student3);

    String studentName1 = referral1.getStudentName();
    String studentSubject1 = referral1.getSubject();
    String studentName2 = referral2.getStudentName();
    String studentSubject2 = referral2.getSubject();
    String studentName3 = referral3.getStudentName();
    String studentSubject3 = referral3.getSubject();

    System.out.println(studentName1);
    System.out.println(studentSubject1);


    Referral[] referralArray = new Referral[3];
    referralArray[0] = new Referral("Ivan", "Biology");
    referralArray[1] = new Referral("Petr", "Math");
    referralArray[2] = new Referral("John", "Geometry");

    for(int i = 0; i < referralArray.length; i++){
      System.out.println(referralArray[i].getStudentName());
     }


    }

  }
