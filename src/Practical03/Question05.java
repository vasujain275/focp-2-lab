//     5. You have been given an empty array(ARR) and its size N. The only input taken from the user will be N. Your task is to populate the arra using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
//Sample Input 1 :
//6
//Sample Output 1 :
//1 3 5 6 4 2

package Practical03;

import java.util.Scanner;
public class Question05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        int[] array = new int[size];
        int start = 0;
        int end = size - 1;
        for (int i = 1; i <= size; i++) {
            if (i % 2 != 0) {
                array[start] = i;
                start++;
            } else {
                array[end] = i;
                end--;
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        input.close();
    }
}
