// Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of the rectangle are entered through the keyboard.

package Practical04;

class Area {
    // Constructor
    int length;
    int breadth;

    public Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int returnArea() {
        return length * breadth;
    }
}

public class Question03 {
    public static void main(String[] args) {
        Area area = new Area(5, 10);
        System.out.println("Area: " + area.returnArea());
    }
}
