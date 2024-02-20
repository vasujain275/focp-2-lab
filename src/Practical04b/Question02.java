// Create a class named 'Rectangle' with two data members- length and breadth and a function to calculate the area which is 'length*breadth'. The class has three constructors which are :
//1 - having no parameter - values of both length and breadth are assigned zero.
//2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
//3 - having one number as parameter - both length and breadth are assigned that number.
//Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
package Practical04b;

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(double length) {
        this.length = length;
        this.breadth = length;
    }

    public void display() {
        System.out.println("Area: " + length * breadth);
    }
}

public class Question02 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(5);
        Rectangle rectangle3 = new Rectangle(5, 10);

        rectangle1.display();
        rectangle2.display();
        rectangle3.display();
    }
}
