class Vehicle {
    void start() {
        System.out.println("Vehicle starting");
    }
}
class Car extends Vehicle {
    void start() {
        System.out.println("Car starting");
    }
}
public class inherit {
    public static void mian(String[] args){
        car c1 = new car();
        c1.start();
    }
}

