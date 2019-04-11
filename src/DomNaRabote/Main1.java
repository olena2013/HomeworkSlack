package DomNaRabote;

public class Main1 {
  public static void main(String[] args) {
    Student student1 = new Student("Bob", "Smith", 30);

    String firstName = student1.getFirstName();
    System.out.println(firstName);

    String lastName = student1.getLastName();
    System.out.println(lastName);

    int age = student1.getAge();
    System.out.println(age);

    student1.setScore(5);

    int middleScore = student1.getScore();
    System.out.println(middleScore);
    for (int i = 0; i < 7; i++) {
      System.out.println("MiddleScore " + "= " + middleScore);
    }
  }
}
