package org.Exercises.w3resource_exercises;

import java.util.Scanner;

public class Program_to_divide_two_numbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę:");
        int num1 = input.nextInt();

        System.out.println("Wprowadź drugą liczbę: ");
        int num2 = input.nextInt();

        int d = num1 / num2;
        System.out.println();
        System.out.println("Wynik dzielenia to: " + d);
    }
}
