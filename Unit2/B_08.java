public class B_08 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.run();
        Bike b = new Bike();
        b.run();
        Airplane a = new Airplane();
        a.run();
        Ship s = new Ship();
        s.run();
    }
}

// Implement Method Overriding
class Vehicle{

    public void run(){
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle{

    public void run(){
        System.out.println("Bike is running");
    }
}

class Airplane extends Vehicle{
    public void run(){
        System.out.println("Airplane is flying");
    }
} 

class Ship extends Vehicle{
    public void run(){
        System.out.println("Ship is sailing");
    }
}