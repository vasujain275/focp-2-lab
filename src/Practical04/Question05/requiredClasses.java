// Write a program to calculate the distance between two points (x1, y1) and (x2, y2). All numbers and return values should be of type double.
// Definition of Done:
//DoD 1: Two java files to be defined. One for class definitions and another for the application
//DoD 2: A class point is defined with two float variables for x1 and x2 and the following functionality:
//
//i. Non-parametrized and parameterized constructors are defined.
//ii. Get and set methods are defined for all the instance variables.
//iii. Distance function is defined to calculate the distance between two points.
//iv. Display function is defined with width of 7 and precision of 2.
//Write this program with a static method definition for calculating the distance between two points.
// This is for class definitions

package Practical04.Question05;

class Point {
    float x1;
    float y1;
    float x2;
    float y2;

    public Point(float x1, float y1, float x2, float y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public float getY2() {
        return y2;
    }

    public void setY2(float y2) {
        this.y2 = y2;
    }

    public double distance() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public void display() {
        System.out.printf("Distance: %7.2f\n", distance());
    }
}
// Main ApplicationPath: src/Practical04/Practical05.Question05.Question05/Solution.java