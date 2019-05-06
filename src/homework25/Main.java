package homework25;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[]a = new int[15];
        Random random = new Random();
        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(15);
        }
        String x = FizzBuzz.fizzBuzzTest(a);
        System.out.println(x);


    }
}
