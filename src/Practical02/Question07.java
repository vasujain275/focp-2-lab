//     7. Write a Java program to print the following pattern for the given N number of rows.
//Pattern for N = 3
// A
// BB
// CCC
package Practical02;

public class Question07 {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print((char) (i + 64));
            }
            System.out.println();
        }
    }
}
