// You have been given a random integer array/list(ARR) of size N, and an integer X. You need to search for the integer X in the given array/list using 'Linear Search'.  You are required to return the index at which X is present in the array/list. If X has multiple occurrences in the array/list, then you need to return the index at which the first occurrence of X would be encountered. In case X is not present in the array/list, then return -1.
//Write a function for Linear Search. 'Linear search' is a method for finding an element within an array/list. It sequentially checks each element of the array/list until a match is found or the whole array/list has been searched.
// Take user input to search

package Practical03;
import java.util.Scanner;
public class Question02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the number to search: ");
        int x = input.nextInt();
        int result = linearSearch(arr, x);
        System.out.println("The number " + x + " is present at index " + result);
    }

    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
