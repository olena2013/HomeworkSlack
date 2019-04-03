package com.company;

public class HomeworkSlack {
  public static void main(String[] args) {
    variousOperation(2, 4, "Bob", "Sacramento");
    variousOperation(5, 8, "John", "Dallas");
    variousOperation(9, 6, "Robin", "San-Francisco");
    variousOperation(5, 1, "Samantha", "Chicago");
    variousOperation(8, 8, "Claudia", "Charlotte");

    greeting("Hello World!");

    userCredentials("12345", "email@gmail.com");
  }

  public static void variousOperation(int a, int b, String x, String y) {
    int c = a + b;
    int d = a * b;
    String name = x;
    String city = y;
    System.out.println(c);
    System.out.println(d);
    System.out.println("My name is " + name + " I live in " + city);

  }

  public static void greeting(String a) {
    int i;
    for (i = 0; i < 10; i++)
      System.out.println(a);
  }

  public static void userCredentials(String password, String email) {
    System.out.println(" Your password " + password + " and email " + email + " don't match");
  }
}

