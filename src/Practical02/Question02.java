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

public class Question02 {
    public static void main(String[] args) {
        char character = 'Q';
        if (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z') {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'
                    || character == 'A' || character == 'E' || character == 'I' || character == 'O'
                    || character == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Error");
        }
    }
}
