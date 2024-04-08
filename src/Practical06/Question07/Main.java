// a)Write a program in java to check if a class can extends another class and/ can implement one and more than one interface.
//
//b)Write a program in java to check if an interface can extend other interface.
//
//c)Write a program in java to check if an interface can also extend multiple interfaces.

package Practical06.Question07;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(5);
        rectangle.displayInfo();
        circle.displayInfo();
    }

}

abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();

    void displayInfo() {
        System.out.println("Shape:");
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
