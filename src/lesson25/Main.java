package lesson25;

public class Main {
    public static void main(String[] args) {

//     String str = " I love Java and coding";
//     Algoritm.printWords(str);
//
     Algoritm algoritm = new Algoritm();
//     algoritm.print("Java");

     String res = algoritm.print1("Java Hello");
     String[] arr1 = res.split(" ");
     System.out.println(res);



    }
}
