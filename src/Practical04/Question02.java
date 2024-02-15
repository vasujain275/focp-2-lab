// Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

package Practical04;

class Triangle {
    int side1 = 3;
    int side2 = 4;
    int side3 = 5;

    public void area() {
        double s = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area: " + area);
    }

    public void perimeter() {
        int perimeter = side1 + side2 + side3;
        System.out.println("Perimeter: " + perimeter);
    }
}

public class Question02 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area();
        triangle.perimeter();
    }
}
