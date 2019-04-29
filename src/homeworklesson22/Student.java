package homeworklesson22;

public class Student extends Person {
    private double averageMark;


    public Student(String firstName, String lastName, int age, double averageMark) {
        super(firstName, lastName, age);
        this.averageMark = averageMark;
    }

    @Override
    public void dance() {
        System.out.println("I can dance 'hip- hop'");
    }
}