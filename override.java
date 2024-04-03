class Vehicle{
    void model(){
        System.out.println("this is a new model");
    }
}
class Car extends Vehicle {
    void model(){
          System.out.println("this is a new car model");
    }
}
class Truck extends Vehicle {
    void model(){
          System.out.println("this is a new Truck model");
    }
}
public class override {
    public static void main(String[] args) {
        Truck t=new Truck();
        Car c=new Car();
        t.model();
        c.model();

    }
}
