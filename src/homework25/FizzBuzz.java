package homework25;

public class FizzBuzz {

    public static String fizzBuzzTest(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0 && a[i] % 5 == 0) {
                return "FizzBuzz";
            } else if (a[i] % 3 == 0) {
                return "Fizz";
            } else if (a[i] % 5 == 0) {
                return "Buzz";
            } else {
                return "String";

            }

        }

        return "Default";
    }
}