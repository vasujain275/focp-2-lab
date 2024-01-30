/*
Q6. You are given a rectangle in a plane whose sides are parallel to the axes. The coordinates of one of its diagonals are provided to you. You have to print the total area of the rectangle.
The coordinates of the rectangle are provided as four integral values: x1, y1, x2, y2. It is given that x1 < x2 and y1 < y2.
*/
package Practical01;
import java.util.Scanner;
public class Question06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the x-coordinate of the first point: ");
        int x1 = input.nextInt();
        System.out.print("Enter the y-coordinate of the first point: ");
        int y1 = input.nextInt();
        System.out.print("Enter the x-coordinate of the second point: ");
        int x2 = input.nextInt();
        System.out.print("Enter the y-coordinate of the second point: ");
        int y2 = input.nextInt();
        int area = (x2 - x1) * (y2 - y1);
        System.out.println("The area of the rectangle is: " + area);
        input.close();
    }
}
