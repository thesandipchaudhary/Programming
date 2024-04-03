//Runtime polymorphism and Dynamic dispatch
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
public class override2 {
    public static void main(String[] args) {
        Vehicle v;  //here v is reference
        v=new Car();
        v.model();
        v=new Truck();
        v.model();
}
}


//lab 13 :implementation of overding
// lab 14 : implementation od dyanmic dispatch

