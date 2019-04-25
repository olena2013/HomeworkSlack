package homeworklesson21;

public class StaticMethod {

  public static double returnMax(double a, double b) {
    if (a < b) {
      return a;
    } else if (a > b) {
      return b;
    } else {
      return a = b;
    }

  }
  public static char[] strMethod(String st){
    char[] arr = st.toCharArray();
    char[] arr1 = new char[arr.length];
    for( int i = 0; i < arr.length; i++){
    }
    return arr;
  }

  public static int getSum (int[]arr){
    int sum = arr[0] + arr[arr.length -1];
    return sum ;


  }
}
