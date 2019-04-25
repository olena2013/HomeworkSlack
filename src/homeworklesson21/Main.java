package homeworklesson21;

public class Main {
  public static void main(String[] args) {

    double st  = StaticMethod.returnMax( 4.64, 9.76 );
    System.out.println(st);


    char[] str = StaticMethod.strMethod("I like Java");
    System.out.println(str);

    int[] temp = {2,6,8,2,3,45};

     int a = StaticMethod.getSum(temp);
     System.out.println(a);
  }
}
