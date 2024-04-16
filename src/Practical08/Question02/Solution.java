package Practical08.Question02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            // Perform arithmetic operations
            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;

            // Handle division by zero
            int quotient = num1 / num2;
            System.out.println("Division result: " + quotient);

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);

        } catch (InputMismatchException e) {
            System.out.println("Error: Input should be an integer.");
            // Consume the invalid input
            scanner.nextLine();
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Close the scanner to prevent resource leak
            scanner.close();
        }
    }
}
