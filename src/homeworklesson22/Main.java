package homeworklesson22;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

      Teacher teacher = new Teacher("Ivan","Ivanov", 55,20);
      Student student = new Student("Petr","Petrov",25, 4.5);

      teacher.dance();
      student.dance();

        ArrayList<Person> listPerson = new ArrayList<>();
        listPerson.add(teacher);
        listPerson.add(student);

        for( int i = 0; i < listPerson.size(); i++){
            System.out.println(listPerson.get(i).getLastName());
        }
    }
}
