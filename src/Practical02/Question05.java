//     5. Write a Java program to print following pattern for given N number of rows:
//Pattern for n=4
// *
// **
// ***
// ****

package Practical02;

public class Question05 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
