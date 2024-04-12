package Practical07.Question02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of tyres: ");
        int numOfTyres = scanner.nextInt();
        scanner.close();

        Vehicle vehicle;

        switch (numOfTyres) {
            case 2:
                vehicle = new Bike();
                break;
            case 4:
                vehicle = new Car();
                break;
            default:
                vehicle = new Vehicle();
                break;
        }

        vehicle.display();
    }
}
