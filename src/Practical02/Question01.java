/*
Write a Java program to solve quadratic equations (use if, else if and else).
Definition of Done:
DoD 1: The program asks the values of coefficients of a quadratic equation.
DoD 2: The program should display the roots or an appropriate message.
*/

package Practical02;
import java.util.Scanner;
public class Question01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (d == 0) {
            double r1 = -b / (2 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
        input.close();
    }
}
