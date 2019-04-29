package homeworklesson22;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName,String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }
    public void dance(){
        System.out.println(" I can dance");
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }



}
