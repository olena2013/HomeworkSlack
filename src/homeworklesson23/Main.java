package homeworklesson23;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] temp = {0, 1, 2, 3, 4, 5, 6};
        int sum = SumArray.sumArray(temp);
        System.out.println(sum);


        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");


        HelloArray.helloArray(arr);
        System.out.println(arr);

    }
}
