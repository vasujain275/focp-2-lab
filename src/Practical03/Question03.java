// 3.     Write a Java Program to count even and odd numbers in an array.
//Definition of Done
//DoD 1: The program should ask the user to enter the elements of the array.
//DoD 2:  Even elements will be stored in EvenArray[] and odd elements will be stored in oddArray[].
//DoD 3: Display all three arrays along with their length.
package Practical03;
import java.util.Scanner;
public class Question03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        int[] array = new int[size];
        int[] evenArray = new int[size];
        int[] oddArray = new int[size];
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            if (array[i] % 2 == 0) {
                evenArray[evenCount] = array[i];
                evenCount++;
            } else {
                oddArray[oddCount] = array[i];
                oddCount++;
            }
        }
        System.out.println("Even array:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArray[i] + " ");
        }
        System.out.println("\nOdd array:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println("\nEven array length: " + evenCount);
        System.out.println("Odd array length: " + oddCount);
        input.close();
    }
}
