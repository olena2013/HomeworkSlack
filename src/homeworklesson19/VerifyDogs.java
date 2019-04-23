package homeworklesson19;

import java.util.ArrayList;

public class VerifyDogs {

  public ArrayList<Integer> getDogsAge(ArrayList<Dog> listDogs ){
    ArrayList<Integer> listDogsAge = new ArrayList<>();

    for(int i = 0; i < listDogs.size(); i++){
      Dog dog = listDogs.get(i);
      int age = dog.getAge();
      listDogsAge.add(age);
    }
    return listDogsAge;
  }
}
