package homeworklesson19;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    VerifyDogs vd = new VerifyDogs();

    Dog dog1 = new Dog("Bobik", 5);
    Dog dog2 = new Dog("Tuzik", 2);
    Dog dog3 = new Dog("Charlie", 10);
    Dog dog4 = new Dog("Don", 7);

    ArrayList<Dog> dogslist = new ArrayList<>();
    dogslist.add(dog1);
    dogslist.add(dog2);
    dogslist.add(dog3);
    dogslist.add(dog4);


   ArrayList<Integer> finalAge = vd.getDogsAge(dogslist);
   for( int i = 0; i < finalAge.size(); i++){
     int ageDogs = finalAge.get(i);
     System.out.println(ageDogs);

   }





  }

}
