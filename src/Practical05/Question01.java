// Create a class named 'Vehicle' with a method to print "This is a vehicle". Now create three other classes named 'Car', 'Truck', and 'Motorcycle' inheriting the 'Vehicle' class, each having a method to print "This is a car", "This is a truck", and "This is a motorcycle" respectively. Create an object of the 'Car' class and call the methods of both the 'Vehicle' and 'Car' classes using this object


class Vehicle {
    void printVehicle() {
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle {
    void printCar() {
        System.out.println("This is a car");
    }
}

class Truck extends Vehicle {
    void printTruck() {
        System.out.println("This is a truck");
    }
}

class Motorcycle extends Vehicle {
    void printMotorcycle() {
        System.out.println("This is a motorcycle");
    }
}

public class Question01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.printVehicle();
        car.printCar();
    }
}