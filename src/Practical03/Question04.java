//  4. Write a Java program to read numbers in an integer array of size 5 and display the following (using functions for each functionality):
//i) Sum of all the elements
//ii) Sum of alternate elements in the array.
//Definition of Done
//DoD 1: The program should ask the user to enter the elements of the array.
//DoD 2: The program should display a menu with the above choices and ask the user to choose one of the choices.

package Practical03;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("1. Sum of all the elements");
        System.out.println("2. Sum of alternate elements in the array");
        System.out.println("Enter your choice:");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sum of all the elements: " + sumOfAllElements(array));
                break;
            case 2:
                System.out.println("Sum of alternate elements in the array: " + sumOfAlternateElements(array));
                break;
            default:
                System.out.println("Invalid choice");
        }
        input.close();
    }

    public static int sumOfAllElements(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static int sumOfAlternateElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum += array[i];
        }
        return sum;
    }
}
