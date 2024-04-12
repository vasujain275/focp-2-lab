package Practical07.Question01;

class Vehicle {
    String make;
    String model;

    // Default constructor
    Vehicle() {
        this.make = "Unknown";
        this.model = "Unknown";
    }

    // Parameterized constructor
    Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Copy constructor
    Vehicle(Vehicle other) {
        this.make = other.make;
        this.model = other.model;
    }

    void display() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

class Car extends Vehicle {
    int year;

    // Default constructor
    Car() {
        super();
        this.year = 0;
    }

    // Parameterized constructor
    Car(String make, String model, int year) {
        super(make, model);
        this.year = year;
    }

    // Copy constructor
    Car(Car other) {
        super(other);
        this.year = other.year;
    }

    void display() {
        super.display();
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Car objects using parameterized and copy constructors
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car(car1);

        // Calling display() method for both objects
        System.out.println("Details of car1:");
        car1.display();
        System.out.println("\nDetails of car2:");
        car2.display();
    }
}
