package DomNaRabote;

public class Algorithm {

  public String div(int a) {
    if (a % 3 == 0 && a % 5 == 0) {
      return "Result C";
    }else if (a % 3 == 0) {
      return "Result A";
    } else if (a % 5 == 0) {
      return "Result B";
    } else {
      return "Other result";
    }
  }
}
