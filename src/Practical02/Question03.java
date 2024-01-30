/*Write a program that takes a number as input and prints all its factors except 1 and the number itself. If the number has only two factors (1 and the number itself), then the program should print -1.*/

package Practical02;

public class Question03 {
    public static void main(String[] args) {
        int number = 7;
        int count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println(-1);
        }
    }
}
