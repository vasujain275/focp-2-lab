// Write a Java program to find the maximum and minimum value of an array.
//Definition of Done:
//DoD 1:  The program should ask the user to enter the elements of the array.
//DoD 2: The program should display the maximum and minimum elements of the array.
package Practical03;

public class Question01 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
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
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
