/*
Write a Java program to solve quadratic equations (use if, else if and else).
Definition of Done:
DoD 1: The program asks the values of coefficients of a quadratic equation.
DoD 2: The program should display the roots or an appropriate message.
*/

package Practical02;

public class Question01 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 1;
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("No real roots");
        }
    }
}
