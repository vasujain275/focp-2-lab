// Write a Java program to find the maximum and minimum value of an array.
//Definition of Done:
//DoD 1:  The program should ask the user to enter the elements of the array.
//DoD 2: The program should display the maximum and minimum elements of the array.
package Practical03;
import java.util.Scanner;
public class Question01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        input.close();
    }
}
