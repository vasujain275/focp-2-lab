/*Write a program that takes a number as input and prints all its factors except 1 and the number itself.
If the number has only two factors (1 and the number itself), then the program should print -1.*/

package Practical02;
import java.util.Scanner;
public class Question03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("-1");
        }
    }
}
