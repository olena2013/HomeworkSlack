package ooplesson1;

import java.util.HashMap;

public class Main2 {
    public static void main(String[] args) {

        HashMap<String, String> map1 = new HashMap<>();

        map1.put("Ivan","1980");
        map1.put("Petr","1985");

        String res = map1.get("Petr");
        System.out.println(res);

    }
}
