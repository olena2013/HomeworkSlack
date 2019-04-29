package homeworklesson22;

public class Teacher extends Person {
    private int experience;

    public Teacher(String firstName,String lastName,int age,int experience){
        super(firstName,lastName,age);
        this.experience =experience;
    }

    @Override
    public void dance(){
        System.out.println("I can dance 'valce'");
    }

}
