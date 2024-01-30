// Write a program to input a name(as a single character) and marks of three tests as m1, m2, and m3 of a student considering all the three marks have been given in integer format.
// Now, you need to calculate the average of the given marks and print it along with the name as mentioned in the output format section. All the test marks are in integers and hence calculate the average in integer as well. That is, you need to print the integer part of the average only and neglect the decimal part.

package Practical01;
import java.util.Scanner;
public class Question04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the student: ");
        char name = input.next().charAt(0);
        System.out.print("Enter the marks of the first test: ");
        int m1 = input.nextInt();
        System.out.print("Enter the marks of the second test: ");
        int m2 = input.nextInt();
        System.out.print("Enter the marks of the third test: ");
        int m3 = input.nextInt();
        int average = (m1 + m2 + m3) / 3;
        System.out.println("Name: " + name);
        System.out.println("Average: " + average);
    }

}
