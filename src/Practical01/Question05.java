/*
Q5. Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.
*/
package Practical01;

public class Question05 {
    public static void main(String[] args) {
        int principal = 1000;
        int rate = 5;
        int time = 2;
        int simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
