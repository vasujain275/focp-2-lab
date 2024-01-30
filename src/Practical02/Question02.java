/*
Write a Java program that asks the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
Definition of Done:
DoD 1: The program asks an input from the user.
DoD 2: A single character input is taken from the user or an error message is
generated.
DoD 3: The program should print “Vowel” if the entered character is a vowel and
“Consonant” if the entered character is a consonant.
*/
package Practical02;
import java.util.Scanner;
public class Question02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println("Vowel");
                default -> System.out.println("Consonant");
            }
        } else {
            System.out.println("Error: Invalid input");
        }
    }
}
