// 3.     Write a Java Program to count even and odd numbers in an array.
//Definition of Done
//DoD 1: The program should ask the user to enter the elements of the array.
//DoD 2:  Even elements will be stored in EvenArray[] and odd elements will be stored in oddArray[].
//DoD 3: Display all three arrays along with their length.
package Practical03;

public class Question03 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int evenCount = 0;
        int oddCount = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
