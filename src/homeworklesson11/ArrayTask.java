package homeworklesson11;

import java.util.Arrays;

public class ArrayTask {
  public static void main(String[] args) {
    String[] array = new String[7];
    array[0] = "Bob";
    array[1] = "Ivan";
    array[2] = "Petr";
    array[3] = "John";
    array[4] = "Vasya";
    array[5] = "Mike";
    array[6] = "Charlie";

   for(int i = 0; i < array.length; i++){
     System.out.println(Arrays.toString(array));
   }


  }


}
