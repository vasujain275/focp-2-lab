// Q1 (Lecture 21):
//
//1)Create a class named Box containing width and height instance variables. Implement a method named volume() in the Box class, which calculates and returns the volume of the box based on its width and height.
//
//2)Extend the Box class to create a subclass named ThreeDBox, which introduces an additional instance variable named depth. In the ThreeDBox class, implement a method named volume() that first calls the volume() method of the Box superclass to obtain the volume of the box. Then, multiply this volume by the depth to calculate the new volume of the ThreeDBox.
//
//3)Further extend the ThreeDBox class to create a subclass named Shipment. In the Shipment class, include an additional instance variable named cost along with the existing instance variables. Implement a method named display() in the Shipment class to display both the volume and the cost.
//
//4)Define default, parameterized, and copy constructors for all classes, ensuring to utilize the super keyword appropriately where applicable.
//
//5)Instantiate an object of the Shipment class and invoke the display() method to display the volume and cost of the shipment object.
//
//6)Note: Initialize data members to -1 in the default constructor.

package Practical06.Question01;

public class Main {
    public static void main(String[] args) {
        Shipment shipment = new Shipment(10, 20, 30, 100);
        shipment.display();
    }
}
