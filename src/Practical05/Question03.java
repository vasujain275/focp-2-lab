// Define a class hierarchy representing vehicles, where Vehicle is the base class, Car inherits from Vehicle, and ElectricCar inherits from Car. Implement the drive() method in Vehicle class to print a message, "Vehicle is being driven”. Add additional methods to the Car class: honk() to simulate honking and refuel() to simulate refueling. Add additional method to ElectricCar class: charge() to charging. Demonstrate the use of inheritance by creating objects of ElectricCar class and invoking all methods from Vehicle, Car and ElectricCar.
package Practical05;

class Vehicle {
    void drive() {
        System.out.println("Vehicle is being driven");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Car is honking");
    }

    void refuel() {
        System.out.println("Car is refueling");
    }
}

class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging");
    }
}

public class Question03 {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.drive();
        electricCar.honk();
        electricCar.refuel();
        electricCar.charge();
    }
}