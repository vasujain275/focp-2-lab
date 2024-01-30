//  4. Write a Java program to read numbers in an integer array of size 5 and display the following (using functions for each functionality):
//i) Sum of all the elements
//ii) Sum of alternate elements in the array.
//Definition of Done
//DoD 1: The program should ask the user to enter the elements of the array.
//DoD 2: The program should display a menu with the above choices and ask the user to choose one of the choices.
package Practical03;

public class Question04 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int sum = 0;
        int alternateSum = 0;
        for (int i : array) {
            sum += i;
        }
        for (int i = 0; i < array.length; i += 2) {
            alternateSum += array[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Alternate sum: " + alternateSum);
    }
}
