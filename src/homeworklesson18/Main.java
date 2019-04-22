package homeworklesson18;

public class Main {
  public static void main(String[] args) {
    Comparison comp = new Comparison();

    String x = comp.compareTwoNumbers(77, 65);
    System.out.println(x);

    Cat cat1 = new Cat("Murzik");
    String  result = cat1.catMethod(cat1);
    System.out.println(result);

  }

}
