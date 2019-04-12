package homeworklesson11;

public class Main {
  public static void main(String[] args) {

    Administrator admin = new Administrator();

    Model male1 = new Model("male", 169);
    Model male2 = new Model("male",186);
    Model female1 = new Model("female", 155);
    Model female2 = new Model("female",180);

    String result = admin.verifyPerson(male1.getSex(),male1.getHeight());
    System.out.println(result);

    String result1 =admin.verifyPerson(male2.getSex(),male2.getHeight());
    System.out.println(result1);

    String result2 = admin.verifyPerson(female1.getSex(),female1.getHeight());
    System.out.println(result2);

    String result3 = admin.verifyPerson(female2.getSex(),female2.getHeight());
    System.out.println(result3);





  }

}
