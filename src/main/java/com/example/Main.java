package com.example;

import java.util.Scanner;

public class Main {
    private static double op1, op2;
    private static Scanner sc;

    private static void input(String operation) {
        System.out.println("\n" + operation + " Operation:\nEnter Operands:");
        System.out.print("Operand 1: ");
        op1 = sc.nextDouble();
        System.out.print("Operand 2: ");
        op2 = sc.nextDouble();
    }
    public static void main(String[] args) {
        calculator cal = new calculator();
        sc = scanner.getInstance();
        int choice = 0;
        while (choice != 5) {
            System.out.println("\nWelcome to the Calculator Program:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    input("Addition");
                    System.out.println("Result = " + cal.addition(op1, op2));
                    break;
                case 2:
                    input("Subtraction");
                    System.out.println("Result = " + cal.subtraction(op1, op2));
                    break;
                case 3:
                    input("Multiplication");
                    System.out.println("Result = " + cal.multiplication(op1, op2));
                    break;
                case 4:
                    input("Division");
                    System.out.println("Result = " + cal.division(op1, op2));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please enter valid choice");
            }
        }
        scanner.close();
    }
}
