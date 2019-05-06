package lesson25;

import java.sql.SQLOutput;

public class Algoritm {

    public static void printWords(String a) {
        String[] array = a.split(" ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public void print(String a) {
        System.out.println(a + " " + "Hello! ");
    }

    public String print1(String b) {
        String res = b + " " + "Hello! ";
        return res;
    }

    public static void printWordsForEach(String a) {
        String[] array = a.split(" ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
