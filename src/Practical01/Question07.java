// Q7. Take a character as input from the user, you need to print the ASCII value of that character.
package Practical01;
import java.util.Scanner;
public class Question07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        int ascii = (int) character;
        System.out.println("The ASCII value of " + character + " is: " + ascii);
        input.close();
    }
}
