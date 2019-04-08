package homeworklesson6;

public class VerifyMyString {
  public static void main(String[] args) {
    String strOne = "Java";
    String strTwo = "Javascript";

    if (strOne.equals(strTwo)) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }

    if(strTwo.contains(strOne)) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }









  }

}
