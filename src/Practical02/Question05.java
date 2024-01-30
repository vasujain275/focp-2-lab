//     5. Write a Java program to print following pattern for given N number of rows:
//Pattern for n=4
// *
// **
// ***
// ****

package Practical02;
import java.util.Scanner;
public class Question05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
