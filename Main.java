interface Vehicle {
    void sound();
    default void start() {
        System.out.println("Silnik został uruchomiony");
    }
    default void stop() {
        System.out.println("Silnik został zgaszony");
    }
    default void fuelUP() {
        System.out.println("Bak paliwa został uzupełniony ");
    }
    static void service() {
        System.out.println("Serwis pojazdu został zrealizowany");
    }
}

class Car implements Vehicle {
    public void sound() {
        System.out.println("Łututututu");
    }
}

class Motorcycle implements Vehicle {
    public void sound() {
        System.out.println("Rambambambambam");
    }
}


public class Vehicle {
    public static void main(String[] args){
        Vehicle Car = new Car();
        Vehicle Motorcycle = new Motorcycle();
        
        Car.start();
        Car.stop();
        Car.fuelUP();
        Car.service();
        
        
        Motorcycle.start();
        Motorcycle.stop();
        Motorcycle.fuelUP();
        Motorcycle.servis();
        
        
        
        
    }
}