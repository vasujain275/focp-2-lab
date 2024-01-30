//     6. You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list. Change in the input array itself.
//Sample Input 1:
//6
//9 3 6 12 4 32
//Sample Output 1 :
//3 9 12 6 32 4
package Practical03;
import java.util.Scanner;
public class Question06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length - 1; i += 2) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        input.close();
    }
}
