//     6. Write a Java program to print the following pattern for given n number of rows:
//Pattern for n=5
//1
//21
//321
//4321
//54321
package Practical02;
import java.util.Scanner;
public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
