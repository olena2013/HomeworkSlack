package homeworklesson14;

public class Main1 {
  public static void main(String[] args) {
    SmallCar car1 = new SmallCar();
    car1.setModel("Toyota");
    car1.setYear("2016");

    String model = car1.getModel();
    String year = car1.getYear();

    System.out.println("Our car is "+ model +" "+ year);

    Truck car2 = new Truck();
    car2.setModel("Volvo");
    car2.setYear("2013");

    String model2 = car2.getModel();
    String year2 = car2.getYear();

    System.out.println("Our truck is "+ model2 +" "+ year2);





  }
}
