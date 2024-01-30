//     7. Write a Java program to print the following pattern for the given N number of rows.
//Pattern for N = 3
// A
// BB
// CCC
package Practical02;
import java.util.Scanner;
public class Question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((char)(i+64));
            }
            System.out.println();
        }
        sc.close();
    }
}
