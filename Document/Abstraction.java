// Abstract class defining the contract
abstract class Vehicle {
    // Abstract method (no implementation detail hidden)
    abstract void startEngine();

    // Concrete method (shared functionality)
    void turnOnLights() {
        System.out.println("Lights are turned on.");
    }
}

// Concrete subclass providing specific implementation
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine starts with a push button.");
    }
}

// Another concrete subclass
class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine starts with a kick-start.");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // You cannot instantiate 'Vehicle' directly: new Vehicle() would fail.
        Vehicle myCar = new Car();
        Vehicle myBike = new Motorcycle();

        // The user only calls the abstract interface; details are hidden.
        myCar.startEngine();  // Output: Car engine starts with a push button.
        myBike.startEngine(); // Output: Motorcycle engine starts with a kick-start.
        
        myCar.turnOnLights(); // Output: Lights are turned on.
    }
}
