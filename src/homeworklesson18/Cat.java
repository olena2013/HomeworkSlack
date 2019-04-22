package homeworklesson18;

public class Cat {
  private String name;

  public Cat(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }

  public String catMethod(Cat catName){
    String name = catName.getName();
    String result = "Cat's name is " + name;
    return result;
  }
}
