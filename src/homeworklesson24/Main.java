package homeworklesson24;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[]result = {1,2,3,4,5,6,7,8,9,10};
        int a = Method.sumElements(result);
        System.out.println(a);

        Cat cat1 = new Cat("Barsik");
        Cat cat2 = new Cat("Myrzik");
        Cat cat3 = new Cat("Bublik");

        cat1.setAge(15);
        cat2.setAge(7);
        cat3.setAge(4);

        ArrayList<Cat> listCats = new ArrayList<>();
        listCats.add(cat1);
        listCats.add(cat2);
        listCats.add(cat3);

        for( int i = 0; i < listCats.size(); i++){
            System.out.println(listCats.get(i).getName());
        }
    }
}
