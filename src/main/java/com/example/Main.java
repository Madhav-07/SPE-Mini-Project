package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int choice = 0;
        while(choice != 5) {
            System.out.println("\nWelcome to the Calculator Program:" );
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    cal.addition(sc);
                    break;
                case 2:
                    cal.subtraction(sc);
                    break;
                case 3:
                    cal.multiplication(sc);
                    break;
                case 4:
                    cal.division(sc);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please enter valid choice");
            }
            sc.close();
        }
    }
}
