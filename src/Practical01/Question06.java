/*
Q6. You are given a rectangle in a plane whose sides are parallel to the axes. The coordinates of one of its diagonals are provided to you. You have to print the total area of the rectangle.
The coordinates of the rectangle are provided as four integral values: x1, y1, x2, y2. It is given that x1 < x2 and y1 < y2.
*/
package Practical01;

public class Question06 {
    public static void main(String[] args) {
        int x1 = 10;
        int y1 = 20;
        int x2 = 30;
        int y2 = 40;
        int area = (x2 - x1) * (y2 - y1);
        System.out.println("Area: " + area);
    }
}
