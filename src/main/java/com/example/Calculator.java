package com.example;

import java.util.Scanner;

public class Calculator 
{
    public void addition(Scanner sc) {
        double num1, num2;
        System.out.println("\nAddition Operation:\nEnter Operands:");
        System.out.print("Operand 1: ");
        num1 = sc.nextDouble();
        System.out.print("Operand 2: ");
        num2 = sc.nextDouble();
        System.out.println("Result = " + (num1+num2));
    }

    public void subtraction(Scanner sc) {
        double num1, num2;
        System.out.println("\nSubtraction Operation:\nEnter Operands:");
        System.out.print("Operand 1: ");
        num1 = sc.nextDouble();
        System.out.print("Operand 2: ");
        num2 = sc.nextDouble();
        System.out.println("Result = " + (num1-num2));
    }

    public void multiplication(Scanner sc) {
        double num1, num2;
        System.out.println("\nMultiplication Operation:\nEnter Operands:");
        System.out.print("Operand 1: ");
        num1 = sc.nextDouble();
        System.out.print("Operand 2: ");
        num2 = sc.nextDouble();
        System.out.println("Result = " + (num1*num2));
    }

    public void division(Scanner sc) {
        double num1, num2;
        System.out.println("\nDivision Operation:\nEnter Operands:");
        System.out.print("Operand 1: ");
        num1 = sc.nextDouble();
        System.out.print("Operand 2: ");
        num2 = sc.nextDouble();
        System.out.println("Result = " + (num1/num2));
    }
}
