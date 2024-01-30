//Write a program that takes two integers (values to be given within the program) and displays the output of the following operators: addition, subtraction, multiplication, division and modulus.
//Definition of Done:
//DoD 1: Assign two numbers to two variables.
//DoD2: Use separate variables to store the results.

package Practical01;

public class Question02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int modulus = a % b;
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);
    }
}
