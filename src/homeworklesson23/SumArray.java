package homeworklesson23;

public class SumArray {

    public static int sumArray(int[]arr){
        int sum = 0;
        int odd = 0;
        for(int i = 0; i< arr.length; i++){
            if( i % 2 != 0 ){
               sum = sum + arr[i];
            }
        }return sum;
    }
}
