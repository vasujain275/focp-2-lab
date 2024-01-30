/*
Q3. Write a Java program to convert minutes into the number of years, months and days.
Definition Of Done :
DoD 1: Ask the user to input the minutes
DoD 2: Display years and months and days in the sequence yy-mm-dd.
*/
package Practical01;
import java.util.Scanner;
public class Question03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        int years = minutes / 525600;
        int months = (minutes % 525600) / 43800;
        int days = ((minutes % 525600) % 43800) / 1440;
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }
}
